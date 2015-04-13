/*
 *  Copyright (c) 2013-2014 Rajan Arora
 *  All Rights Reserved Worldwide.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.airware.commandserver;

import java.io.*;
import java.net.*;

/**
 * @author Rajan Arora
 * @since Nov 5, 2014
 */
public class Listener {

    private static String ip = "localhost";
    private static int port = 5111;

    private static Socket socket;
    private static PrintWriter out;
    private static BufferedReader in;

    public static void listenSocket() {
        // Create socket connection
        try {
            socket = new Socket(ip, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: kq6py");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("No I/O");
            System.exit(1);
        }
    }

    public static void main(String[] args) {

        listenSocket();
        // Send data over socket
        out.println("loopback");
        out.println("tesadsdsad");
        // Receive text from server
        try {
            String line = in.readLine();
            System.out.println("Text received: " + line);
        } catch (IOException e) {
            System.out.println("Read failed");
            System.exit(1);
        }
    }

}
