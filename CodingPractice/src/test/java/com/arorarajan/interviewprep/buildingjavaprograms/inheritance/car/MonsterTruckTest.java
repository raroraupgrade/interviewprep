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
package com.arorarajan.interviewprep.buildingjavaprograms.inheritance.car;

import org.junit.Test;

import com.arorarajan.interviewprep.buildingjavaprograms.inheritance.car.MonsterTruck;

import static org.junit.Assert.assertEquals;

/**
 * @author Rajan Arora
 * @since Oct 15, 2014
 */
public class MonsterTruckTest {
    Car bigfoot = new MonsterTruck();
    @Test
    public void monsterTruckTest () {
        assertEquals("monster 1", bigfoot.m1());
        assertEquals("truck 1 / car 1", bigfoot.m2());
        assertEquals("monster vroomvroom", bigfoot.toString());
        assertEquals("monster truck started", ((MonsterTruck) bigfoot).monsterStart());
    }
}
