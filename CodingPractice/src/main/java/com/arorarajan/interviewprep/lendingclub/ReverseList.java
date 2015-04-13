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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Rajan Arora
 * @since Oct 21, 2014
 */
public class ReverseList {
    public static List<Integer> reverse(List<Integer> a) {
        int len = a.size();

        Iterator<Integer> fwd = a.iterator();
        Iterator<Integer> rev = a.listIterator(len - 1);

        // while (fwd != rev) {
        // Integer tmp = fwd.next();
        // fwd.next(). = rev.next();
        // rev.next() = tmp;
        // }

        for (int i = 0; i < len / 2; i++) {
            Integer tmp = a.get(i);
            a.set(i, a.get(len - i - 1));
            a.set(len - i - 1, tmp);
        }
        return a;
    }

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>();

        a.add((Integer) 2);
        a.add((Integer) 3);
        a.add((Integer) 4);
        a.add((Integer) 5);

        System.out.println(a);

        System.out.println(reverse(a));

    }
}
