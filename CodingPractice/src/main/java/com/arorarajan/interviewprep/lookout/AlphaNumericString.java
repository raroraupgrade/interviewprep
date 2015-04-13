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
package com.arorarajan.interviewprep.lookout;

/**
 * @author Rajan Arora
 * @since Nov 7, 2014
 */
public class AlphaNumericString {
    private static String getAlphaNumeric(String input) {
        if (input == null)
            return null;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetterOrDigit(input.charAt(i)))
                result.append(input.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(getAlphaNumeric("asdjd@#&*(998**008lmAA"));
        if (getAlphaNumeric(null) == null)
            System.out.println("Works");
    }
}