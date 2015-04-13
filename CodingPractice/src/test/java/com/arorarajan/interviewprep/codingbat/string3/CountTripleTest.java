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

import org.junit.Before;
import org.junit.Test;
//import static org.easymock.EasyMock.createMock;
import static org.junit.Assert.assertEquals;

/**
 * Test for the CountTriple: http://codingbat.com/prob/p195714
 * 
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class CountTripleTest {

    private CountTriple countTriple = new CountTriple();

    @Before
    public void before() {
        // countTripleService = createMock(CountTriple.class);
    }

    @Test
    public void testCountTriple() {
        assertEquals(1, countTriple.countTriple("abcXXXabc"));
        assertEquals(3, countTriple.countTriple("xxxabyyyycd"));
        assertEquals(0, countTriple.countTriple("a"));
        assertEquals(0, countTriple.countTriple(""));
        assertEquals(1, countTriple.countTriple("XXXabc"));
        assertEquals(2, countTriple.countTriple("XXXXabc"));
        assertEquals(3, countTriple.countTriple("XXXXXabc"));
        assertEquals(3, countTriple.countTriple("222abyyycdXXX"));
        assertEquals(4, countTriple.countTriple("abYYYabXXXXXab"));
        assertEquals(0, countTriple.countTriple("abYYXabXXYXXab"));
        assertEquals(0, countTriple.countTriple("abYYXabXXYXXab"));
        assertEquals(1, countTriple.countTriple("122abhhh2"));
    }
}