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
package com.arorarajan.interviewprep.codingbat.string3;

/**
 * Problem Statement: http://codingbat.com/prob/p121193 Given a string, return the sum of the
 * numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more
 * digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0',
 * '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 * 
 * sumNumbers("abc123xyz") -> 123
 * 
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class SumNumbers {
    public int sumNumbers(String str) {
        String num = "";
        int sumNumbers = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                num += str.charAt(i);
            else if (num.length() > 0) {
                sumNumbers += Integer.parseInt(num);
                num = "";
            }
            else
                num = "";
        }
        if (num.length() > 0)
            sumNumbers += Integer.parseInt(num);
        return sumNumbers;
    }
}
