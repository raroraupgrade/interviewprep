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
package com.arorarajan.interviewprep.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rajan Arora
 * @since Nov 1, 2014
 */
public class PrefixSet {
    public int solution(int[] A) {
        if (A.length == 1)
            return 0;
        Set<Long> s = new HashSet<Long>();
        s.add((long) A[0]);
        int result = 0;
        for (int i=1; i<A.length; i++) {
            if (!s.contains((long)A[i])) {
                s.add((long) A[i]);
                result = i;
            }
        }
        return result;
    }
}
