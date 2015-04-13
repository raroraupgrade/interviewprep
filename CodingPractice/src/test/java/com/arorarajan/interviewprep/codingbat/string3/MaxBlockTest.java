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
package com.arorarajan.interviewprep.codingbat.string3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for MaxBlock: http://codingbat.com/prob/p179479
 * 
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class MaxBlockTest {
    private MaxBlock maxBlock = new MaxBlock();

    @Test
    public void maxBlockTest() {
        assertEquals(2, maxBlock.maxBlock("hoopla"));
        assertEquals(3, maxBlock.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, maxBlock.maxBlock(""));
        assertEquals(1, maxBlock.maxBlock("xyz"));
        assertEquals(2, maxBlock.maxBlock("xxyz"));
        assertEquals(2, maxBlock.maxBlock("xyzz"));
        assertEquals(3, maxBlock.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, maxBlock.maxBlock("XXBBBbbxx"));
        assertEquals(4, maxBlock.maxBlock("XXBBBBbbxx"));
        assertEquals(4, maxBlock.maxBlock("XXBBBbbxxXXXX"));
        assertEquals(4, maxBlock.maxBlock("XX2222BBBbbXX2222"));
    }
}
