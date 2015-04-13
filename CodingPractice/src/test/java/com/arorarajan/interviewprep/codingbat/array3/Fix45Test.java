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

import org.junit.Test;

import com.arorarajan.interviewprep.codingbat.array3.Fix45;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for Fix45 class: http://codingbat.com/prob/p125819
 * 
 * @author Rajan Arora
 * @since Jun 15, 2014
 */
public class Fix45Test {
    private Fix45 fix45 = new Fix45();
    @Test
    public void fix45Test() {
        assertArrayEquals(new int [] {1, 4, 5, 4, 5}, fix45.fix45(new int[] {5, 4, 5, 4, 1}));
    }
}
