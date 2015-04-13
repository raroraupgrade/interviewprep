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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.arorarajan.interviewprep.codingbat.array3.MaxSpan;

/**
 * Test for MaxSpan class: http://codingbat.com/prob/p189576
 * 
 * @author Rajan Arora
 * @since Jun 15, 2014
 */
public class MaxSpanTest {
    private MaxSpan maxSpan = new MaxSpan();
    @Test
    public void maxSpanTest () {
        assertEquals(4, maxSpan.maxSpan(new int[] {1, 2, 1, 1, 3}));
        assertEquals(6, maxSpan.maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, maxSpan.maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
        assertEquals(3, maxSpan.maxSpan(new int[] {3, 3, 3}));
        assertEquals(3, maxSpan.maxSpan(new int[] {3, 9, 3}));
        assertEquals(2, maxSpan.maxSpan(new int[] {3, 9, 9}));
        assertEquals(1, maxSpan.maxSpan(new int[] {3, 9}));
        assertEquals(2, maxSpan.maxSpan(new int[] {3, 3}));
        assertEquals(0, maxSpan.maxSpan(new int[] {}));
        assertEquals(1, maxSpan.maxSpan(new int[] {1}));
    }
}
