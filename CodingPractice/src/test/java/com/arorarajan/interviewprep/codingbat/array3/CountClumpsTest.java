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

/**
 * @author Rajan Arora
 * @since Oct 11, 2014
 */
public class CountClumpsTest {
    private CountClumps countClumps = new CountClumps();

    @Test
    public void countClumpsTest() {
        assertEquals(2, countClumps.countClumps(new int[] { 1, 2, 2, 3, 4, 4 }));
        assertEquals(2, countClumps.countClumps(new int[] { 1, 1, 2, 1, 1 }));
        assertEquals(1, countClumps.countClumps(new int[] { 1, 1, 1, 1, 1 }));
    }
}
