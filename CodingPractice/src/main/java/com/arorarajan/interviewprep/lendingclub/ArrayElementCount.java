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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rajan Arora
 * @since Oct 19, 2014
 */
public class ArrayElementCount {
    public Map<Integer, Integer> countElements(int[] a) {        // using Diamond operator in Java 7
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (result.containsKey(a[i])) {
                int count = (int) result.get(a[i]);
                count++;
                result.put((Integer) a[i], (Integer) count);
            } else
                result.put((Integer) a[i], 1);
        }
        for (Integer key : result.keySet()) {
            System.out.println("Value: " + key + " " + result.get(key));
        }
        return result;
    }
}
