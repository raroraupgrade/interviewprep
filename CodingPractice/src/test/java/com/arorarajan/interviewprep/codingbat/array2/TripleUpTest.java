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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test for TripleUp: http://codingbat.com/prob/p137874
 * 
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class TripleUpTest {
    private TripleUp tripleUp = new TripleUp();

    @Test
    public void tripleUpTest() {
        assertTrue(tripleUp.tripleUp(new int[] { 1, 4, 5, 6, 2 }));
        assertTrue(tripleUp.tripleUp(new int[] { 1, 2, 3 }));
        assertFalse(tripleUp.tripleUp(new int[] { 1, 2, 4 }));
        assertTrue(tripleUp.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 6, 7, 6 }));
        assertFalse(tripleUp.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 7, 7, 6 }));
        assertFalse(tripleUp.tripleUp(new int[] { 1, 2 }));
        assertFalse(tripleUp.tripleUp(new int[] { 1 }));
        assertFalse(tripleUp.tripleUp(new int[] {}));
        assertTrue(tripleUp.tripleUp(new int[] { 10, 9, 8, -100, -99, -98, 100 }));
        assertFalse(tripleUp.tripleUp(new int[] { 10, 9, 8, -100, -99, 99, 100 }));
        assertTrue(tripleUp.tripleUp(new int[] { -100, -99, -99, 100, 101, 102 }));
        assertFalse(tripleUp.tripleUp(new int[] { 2, 3, 5, 6, 8, 9, 2, 3 }));
    }
}
