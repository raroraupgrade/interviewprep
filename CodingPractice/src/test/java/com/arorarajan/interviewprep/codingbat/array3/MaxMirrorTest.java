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

import com.arorarajan.interviewprep.codingbat.array3.MaxMirror;

/**
 * @author Rajan Arora
 * @since Sep 29, 2014
 */
public class MaxMirrorTest {
    private MaxMirror maxMirror = new MaxMirror();

    @Test
    public void maxMirrorTest() {
        assertEquals(3, maxMirror.maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2, 1 }));
        assertEquals(5, maxMirror.maxMirror(new int[] { 1, 2, 3, 2, 1 }));
        assertEquals(2, maxMirror.maxMirror(new int[] { 7, 1, 2, 9, 7, 2, 1 }));
    }
}