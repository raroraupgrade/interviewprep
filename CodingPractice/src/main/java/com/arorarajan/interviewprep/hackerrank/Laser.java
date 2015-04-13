/*
 *  Copyright (c) 2013-2015 Rajan Arora
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
package com.arorarajan.interviewprep.hackerrank;

/**
 * @author Rajan Arora
 * @since Jan 18, 2015
 */

import java.util.HashSet;
import java.util.Set;

public class Laser {
    private static final int east = 0;
    private static final int west = 1;
    private static final int south = 2;
    private static final int north = 3;
    // contains the directions after encountering a / mirror
    private static final int[] right90 = new int[] { north, south, west, east };
    // contains the directions after encountering a \ mirror
    private static final int[] left90 = new int[] { south, north, east, west };
    // contains the directions after encountering a 0 mirror
    private static final int[] opposite = new int[] { west, east, north, south };

    /**
     * calculates the next direction based on the incoming direction and the current position char
     * 
     * @param in
     * @return
     */
    private static int next(int d, char c) {
        if (c == '-' || c == '@') {
            return d;
        }

        if (c == '^') {
            return north;
        }

        if (c == 'v') {
            return south;
        }

        if (c == '>') {
            return east;
        }

        if (c == '<') {
            return west;
        }

        if (c == 'O') {
            return opposite[d];
        }

        if (c == '\\') {
            return left90[d];
        }

        return right90[d];
    }

    // determine N and the laser position by scanning the input
    private static int[] find(String in, int size) {
        final int t = -1;
        int[] r = new int[] { t, t };
        for (int i = 0; i < size; ++i) {
            if (in.charAt(i) == '\n' && r[0] == t) {
                r[0] = i;
                if (r[1] > t) {
                    return r;
                }
                continue;
            }

            if (in.charAt(i) == '@') {
                r[1] = i;
                if (r[0] > t) {
                    return r;
                }
            }
        }
        r[0] = size;
        return r;
    }

    private static int move(int p, int d, int n) {
        int[] offset = new int[] { 1, -1, n + 1, -n - 1 };
        return p + offset[d];
    }

    private static int solution(String in) {
        final int size = in.length();
        int[] r = find(in, size);
        final int n = r[0];
        // initial laser position
        int p = r[1];
        // initial direction
        int d = east;
        char c;
        Set<String> positions = new HashSet<String>();

        while (p < size && p > -1) {
            c = in.charAt(p);
            if (c == '\n') {
                break;
            }

            // direction|position tuple
            String s = d + "|" + p;
            if (positions.contains(s)) {
                // loop
                return -1;
            }
            positions.add(s);

            // calculate direction
            d = next(d, c);

            // move to the new position following the direction
            p = move(p, d, n);
        }

        return positions.size();
    }

    public static void main(String[] args) throws Exception {
        tc("@--\n---\n---"); // 3
        tc("@-v\n---\n---\n---"); // 6
        tc("@-v-\n----\n--<-"); // 7
        tc("@-v\n---\n-^<"); // 8
        tc("@-v\n->-\n-^<"); // 8
        tc("@-v\n->v\n-^<"); // -1
        tc("@--\\\n/-\\-\n-O/-\n\\--/"); // 31
        tc("/@\\\n---\n\\O/"); //-1
    }

    private static void tc(String in) {
        System.out.println(in);
        System.out.println("Output: " + solution(in));
    }
}