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
package com.arorarajan.interviewprep.codingbat.array2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for BigDiff: http://codingbat.com/prob/p196640
 * 
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class BigDiffTest {
    private BigDiff bigDiff = new BigDiff(); 
    @Test
    public void bigDiffTest() {
        assertEquals(7, bigDiff.bigDiff(new int[] {10, 3, 5, 6}));
        assertEquals(8, bigDiff.bigDiff(new int[] {7, 2, 10, 9}));
        assertEquals(8, bigDiff.bigDiff(new int[] {2, 10, 7, 2}));
        assertEquals(8, bigDiff.bigDiff(new int[] {2, 10}));
        assertEquals(8, bigDiff.bigDiff(new int[] {10, 2}));
        assertEquals(10, bigDiff.bigDiff(new int[] {10, 0}));
        assertEquals(1, bigDiff.bigDiff(new int[] {2, 3}));
        assertEquals(0, bigDiff.bigDiff(new int[] {2, 2}));
        assertEquals(0, bigDiff.bigDiff(new int[] {2}));
        assertEquals(8, bigDiff.bigDiff(new int[] {5, 1, 6, 1, 9, 9}));
        assertEquals(3, bigDiff.bigDiff(new int[] {7, 6, 8, 5}));
        assertEquals(3, bigDiff.bigDiff(new int[] {7, 7, 6, 8, 5, 5, 6}));
    }
}
