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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test for SumNumbers class: http://codingbat.com/prob/p121193
 * 
 * @author Rajan Arora
 * @since Jun 15, 2014
 */
public class SumNumbersTest {
    private SumNumbers sumNumbers = new SumNumbers();

    @Test
    public void sumNumbersTest() {
        assertEquals(123, sumNumbers.sumNumbers("abc123xyz"));
        assertEquals(44, sumNumbers.sumNumbers("aa11b33"));
        assertEquals(18, sumNumbers.sumNumbers("7 11"));
        assertEquals(0, sumNumbers.sumNumbers("Chocolate"));
        assertEquals(7, sumNumbers.sumNumbers("5hoco1a1e"));
        assertEquals(7, sumNumbers.sumNumbers("5$$1;;1!!"));
        assertEquals(1245, sumNumbers.sumNumbers("a1234bb11"));
        assertEquals(0, sumNumbers.sumNumbers(""));
        assertEquals(25, sumNumbers.sumNumbers("a22bbb3"));
    }
}
