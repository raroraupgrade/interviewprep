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

import static org.junit.Assert.*;

import java.io.*;
import java.net.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Rajan Arora
 * @since Nov 5, 2014
 */
public class CommandServerTest {

    private String ip = "localhost";
    private int port = 5111;
    private PrintWriter out;
    private BufferedReader in;
    private Socket socket;
    private CommandServer cs = new CommandServer(ip, port);

    @BeforeTest
    public void setUp() {

        // Start the server
        try {
            cs.start_server();
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        // Start listening on the Command Server
        // Running as a separate Thread so it's asynchronous and doesn't
        // block text execution flow
        CommandServerStartListener csl = new CommandServerStartListener(cs);
        Thread listener = new Thread(csl);
        listener.start();

        // Create socket connection
        try {
            socket = new Socket(ip, port);
            System.out.println("Connected: " + socket);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("No I/O");
        }

        // Now wait for commands on the server
        CommandServerStartWaitingForCommands csw = new CommandServerStartWaitingForCommands(cs);
        Thread waiter = new Thread(csw);
        waiter.start();
    }

    @AfterTest
    public void tearDown() {
        // Attempt to close socket
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Shutdown server
            cs.close();
        }
    }

    // Loopback test with normal String inputs
    @Test
    public void loopBackTestWithNormalInputs() {
        assertTrue(cs.is_running());
        assertTrue(cs.is_connected());
        out.println("loopback");
        out.println("abc");
        try {
            assertEquals("abc", in.readLine());
        } catch (IOException e) {
            System.out.println("Read failed on command server");
            e.printStackTrace();
        } finally {
            tearDown();
        }
    }

    // Test to print with small output string
    @DataProvider
    public Object[][] printString() {
        return new Object[][] { {"abc"}, {" "}, {"sadjhkahskjdhsiu2132hei2k92dsadsbad"} };
    }

    @Test (dataProvider = "printString")
    public void printTestWithNormalInputs(final String printString) throws InterruptedException {
        assertTrue(cs.is_running());
        assertTrue(cs.is_connected());
        out.println("print");
        Thread.sleep(100);     
        out.println(printString);
        Thread.sleep(100);     
        System.out.println("From the test: " + cs.getPrintOutput().trim());
        assertEquals("print: " + printString, cs.getPrintOutput().trim());
    }

    // The above Unit tests can be made data driven with the following Input strings in
    // place of the String "abc"
    // 1. Blank space " "
    // 2. String more than 512 bytes, because the input reader is only reading 512 bytes from the
    // input stream

    // And finally we test the server with multiple clients attempting to connect at the same time
    // Clients will be implemented as an extension of the Java Runnable class

}
