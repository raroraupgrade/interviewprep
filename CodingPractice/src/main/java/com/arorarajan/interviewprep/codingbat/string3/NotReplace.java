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
 * @author Rajan Arora
 * @since Nov 1, 2014
 */
public class NotReplace {
    public static String notReplace(String str) {
        StringBuilder result = new StringBuilder(str);
        int resultLengthAdditions = 0;
        int len = str.length();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                if (i != 0) {
                    // "is" somewhere except beginning of str
                    if (Character.isLetter(str.charAt(i - 1)))
                        continue;
                    if (i + 2 < len) {
                        if (Character.isLetter(str.charAt(i + 2)))
                            continue;
                    }
                    result.insert(i + resultLengthAdditions+2, " not");
                    resultLengthAdditions += 4;
                } else {
                    // "is" at beginning of str
                    if (i + 2 < len) {
                        if (Character.isLetter(str.charAt(i + 2)))
                            continue;
                    }
                    result.insert(i + resultLengthAdditions+2, " not");
                    resultLengthAdditions += 4;
                }
            }
        }
        return result.toString();
    }

    public static String insertNot(String str, int index) {
        String result = str.substring(0, index + 2) + " not"
                + str.substring(index + 2, str.length());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(notReplace("isis"));
    }
}
