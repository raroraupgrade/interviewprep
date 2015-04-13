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
 * @since Nov 3, 2014
 */
// We are developing a method called binCounter(), it takes a string as input, and it returns an
// array of length two. In that array are the counts representing the number of zeroes and ones
// in the string, respectively. For example, If the input string is "0", then the output would
// be [1, 0]. Please provide the test cases you would use to verify this method
//
// Please write binCounter()

public class BinCounter {

    public int[] binCounter(String str) {
        if (str == null) {
            return new int[] {-1, -1};
        }
        int[] result = { 0, 0 };
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '0')
                result[0]++;
            if (str.charAt(i) == '1')
                result[1]++;
        }
        return result;
    }
}