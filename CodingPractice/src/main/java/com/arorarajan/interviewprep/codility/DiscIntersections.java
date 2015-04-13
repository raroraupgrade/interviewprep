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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Rajan Arora
 * @since Nov 1, 2014
 */
public class DiscIntersections {
    public int solution(int[] A) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        if (A.length == 0)
            return 0;
        int intersects = 0;
        m.put(0, A[0]);
        for (int i = 1; i < A.length; i++) {
            for (Integer j : m.keySet()) {
                if (intersect(j, i, m.get(j), A[i]))
                    intersects++;
            }
            if (!m.containsValue(A[i]))
                m.put(i, A[i]);
        }
        return intersects;
    }

    public boolean intersect(long x1, long x2, long rad1, long rad2) {
        if (x1 < x2 && x1 + rad1 >= x2 - rad2)
            return true;
        if (x2 < x1 && x2 + rad2 >= x1 - rad1)
            return true;
        if (x1 == x2)
            return false;
        return false;
    }
}
