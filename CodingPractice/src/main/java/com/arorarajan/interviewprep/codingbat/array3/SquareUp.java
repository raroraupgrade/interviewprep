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
package com.arorarajan.interviewprep.codingbat.array3;

/**
 * @author Rajan Arora
 * @since Oct 11, 2014
 */
public class SquareUp {
    public static void main(String[] args) {
        int n = 5;
        int[] result = squareUp(n);
        for (int i = 0; i < n * n; i++)
            System.out.print(result[i] + ",");
    }

    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++)
                result[i + n * j] = (j > i) ? n - i : 0;
        }
        return result;
    }
}
