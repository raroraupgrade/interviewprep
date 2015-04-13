package com.airware.commandserver;
import java.io.*;
import java.net.*;

public class CommandServer {

	public static final String[] SUPPORTED_COMMANDS = {"loopback", "print", "close"};
	
	private boolean running = false;
	private boolean connected = false;

	private String ip = "localhost";
	private int port = 5111;
	
	private ServerSocket serverSocket;
	private Socket server;

	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	
	private String printOutput="";

	CommandServer() {
	}

	CommandServer(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public boolean start_server() throws IOException, UnknownHostException {
		try{
			serverSocket = new ServerSocket(port, 1, InetAddress.getByName(ip));
			serverSocket.setReuseAddress(true);

		} catch (UnknownHostException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}

		System.out.println("Server running");
        running = true;

        return true;
	}

	public boolean is_running(){
		return running;
	}
	
	public boolean is_connected(){
		return connected;
	}

	public void start_listening() throws IOException {
		try {
			server = serverSocket.accept();
			System.out.println("Received connection from " + server.getRemoteSocketAddress());
			connected = true;

			inputStream = new DataInputStream(server.getInputStream());
			outputStream = new DataOutputStream(server.getOutputStream());

		} catch (IOException e) {
			throw e;
		}
		
	}

	private int getData(byte[] b) throws IOException {
		try {
			return inputStream.read(b, 0, 32);
		} catch (IOException e) {
			throw e;
		}
	}

	public void wait_for_commands() {
		
		while(is_connected()) {
			try {
				byte[] b = new byte[32];
				int read = getData(b);

				if (read < 0) {
					break;
				} else if (read == 0) {
					continue;
				}

				String cmd = new String(b, "UTF-8").trim();	
				
				if(cmd.equals("loopback")) {
					byte[] p = new byte[512];
					read = getData(p);
					if (read > 0) {
						outputStream.write(p, 0, p.length);
					}
				
				} else if (cmd.equals("print")) {
					byte[] p = new byte[512];
					read = getData(p);
					if (read > 0) {
					    printOutput = "print: " + new String(p, "UTF-8");
					    System.out.println("Set printOutput string");
						System.out.println("print: " + new String(p, "UTF-8"));
					}
				
				} else if (cmd.equals("close")) {
					break;
				
				} else {
					System.out.println("Received unsupported command: " + cmd);
				}

			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				break;
			}
		}
		close();
	}
	public void close() {
		try {
			server.close();
			serverSocket.close();
			System.out.println("Closed connection to " + server.getRemoteSocketAddress());
			connected = false;
			running = false;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getPrintOutput() {
	    return printOutput;
	}
	
	public static void main (String[] args) {
		CommandServer server = new CommandServer();
		while(true) {
			try {
				server.start_server();
				server.start_listening();
				server.wait_for_commands();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}
}