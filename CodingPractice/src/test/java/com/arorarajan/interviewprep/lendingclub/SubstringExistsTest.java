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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Rajan Arora
 * @since Oct 21, 2014
 */
public class SubstringExistsTest {
    SubstringExists se = new SubstringExists();
    @Test
    public void substringExistsTest () {
        assertEquals (true, se.exists("sabcsdefszyxbc", "szyx"));
        assertEquals (true, se.exists("sabcsdefszyxbc", "s"));
        assertEquals (false, se.exists("sabcsdefszyxbc", "sxbc"));
        assertEquals (true, se.exists("sabcsdefszyxbc", "sabc"));
    }
}
