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
package com.arorarajan.interviewing.TryCatch;

/**
 * @author Rajan Arora
 * @since Jun 20, 2014
 */
public class TryCatch {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("A");
            System.out.println(TryCatch.hello());
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        }
    }

    public static String hello() throws Exception {
        try {
            System.out.println("1");
            throw new Exception();
        } 
        catch (Exception e) {
            System.out.println("2");
            return "X";
        } finally {
            System.out.println("3");
        }
    }
}