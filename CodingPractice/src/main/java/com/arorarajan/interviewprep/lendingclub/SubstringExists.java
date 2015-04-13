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
package com.arorarajan.interviewprep.lendingclub;

/**
 * @author Rajan Arora
 * @since Oct 21, 2014
 */
public class SubstringExists {
    public boolean exists(String s, String sub) {
        int len = s.length();
        // if (s.contains(sub))
        // return true;
        for (int i = 0; i < len; i++) {
            if (sub.charAt(0) == s.charAt(i)) {
                for (int j = 0; j < sub.length() && (i + j) < len; j++) {
                    if (s.charAt(i + j) == sub.charAt(j)) {
                        if (j == sub.length() - 1)
                            return true;
                        else
                            continue;
                    } else
                        break;
                }
            }
        }
        return false;
    }
}
