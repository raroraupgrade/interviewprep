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
package com.arorarajan.interviewprep.lookout;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Rajan Arora
 * @since Nov 3, 2014
 */
public class BinCounterTest {
    private BinCounter b = new BinCounter();
    @Test
    public void binCounterTest() {
         Assert.assertArrayEquals(new int[] {1,0}, b.binCounter("0"));
         Assert.assertArrayEquals(new int[] {0,0}, b.binCounter(""));
         Assert.assertArrayEquals(new int[] {7,5}, b.binCounter("01001 00 01110"));
         Assert.assertArrayEquals(new int[] {5,6}, b.binCounter("asdn10011asa *@#!# 100011"));
         assertEquals(2, b.binCounter("0").length);
         int[] result = b.binCounter("0110");
         assertTrue(result[0] >= 0);
         assertTrue(result[1] >= 0);
         result = b.binCounter(null);
         assertTrue(result[0] == -1);
         assertTrue(result[1] == -1);
    }
}