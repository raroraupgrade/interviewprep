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

/**
 * @author Rajan Arora
 * @since Oct 15, 2014
 */
public class MonsterTruck extends Truck {
    public String m1() {
        return "monster 1";
    }

    public String m2() {
        return super.m1() + " / " + super.m2();
    }
    
    public String toString () {
        return "monster " + super.toString();
    }
    
    public String monsterStart () {
        return "monster truck started";
    }
}
