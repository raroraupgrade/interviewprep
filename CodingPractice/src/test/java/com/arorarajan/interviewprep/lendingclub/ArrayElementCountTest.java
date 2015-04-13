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
package com.arorarajan.interviewprep.lendingclub;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Rajan Arora
 * @since Oct 20, 2014
 */
public class ArrayElementCountTest {
    ArrayElementCount arrayElementCount = new ArrayElementCount();

    @Test
    public void testArrayElementCount() {
        assertEquals("{1=4, 3=3, 4=2}",
                arrayElementCount.countElements(new int[] { 1, 1, 3, 1, 4, 1, 3, 3, 4 }).toString());
        assertEquals("{0=3, 1=2, 2=1, 3=2, 4=1}",
                arrayElementCount.countElements(new int[] { 1, 0, 3, 0, 0, 1, 3, 2, 4 }).toString());
        assertEquals("{1=3, 2=3, 3=2, 5=1}",
                arrayElementCount.countElements(new int[] { 1, 1, 2, 1, 2, 2, 3, 3, 5 }).toString());
    }
}
