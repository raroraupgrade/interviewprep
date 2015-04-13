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
package com.arorarajan.interviewprep.hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Rajan Arora
 * @since Nov 9, 2014
 */
public class LaserDistanceTest {
    private LaserDistance ld = new LaserDistance();

    @Test
    public void laserDistanceTest() {
        assertEquals(3, ld.travel("@--\n---\n---")); // 1
        assertEquals(5, ld.travel("@-v\n---\n---")); // 2
        assertEquals(8, ld.travel("@-v\n---\n-^<")); // 3
        assertEquals(8, ld.travel("@-v\n->-\n-^<")); // 4
        assertEquals(
                84,
                ld.travel("------>--v----<-----------<---<-------^-\n-------^--^--<v--^^-------<------->-----\n------^->-<----<-------->---^---<------>\nv--------<------<---<-^----^----------<-\n---<--<--------v-v^----^---^----v-------\n-<-^->--->->>-----<--->-----------------\n-v-@--------->v->>------>---v--<----<---\n^--------------<--^---<-->----><----^-v-\n------------->----<------->---v------>--\n-v^--v->-----<----<--------v------------\n^----->---^--------------------^-v------\n-------<-^-^-->---v-<<--------->^-------\n>--^^--------v-<-->---------------v---<-\n---^^-------^->-----<-----v-----^-v-<--v\n--v-->-----------v------>-<--v---^--^---\n----^----v--->------------v--------v<^<-\n>-------------v^----------->-<>->-------\n---->-^v--------------^-------->>-----^-\n-^--v---------<<--->>------<-<<---------\n-------<----v---<-----<<-<<---^--------^\n---v--v---^---------^--v--v-------<>----\n<-------------^---->----------->^->-----\n^<^->------<----------^-----<-------->--\n--<-<-<----<v------------------<-->-v-^-\n----------->---------v---^--v-<--->--^--\n<--^vv--------<^--v------------>-->----^\nv----^->--v>-------------------<------^-\n--------------v-<-<------<--v----^------\n-------<-<-^--^--->----->--v--^-^-------\n^-------<----->-->---->---------^----^--\n>^---------->--vv>-v---v---^------>-----\n---v->--<-----^-^------------v--->--^---\n---->-----------^--------->--v--v>----<-\n-v---><v---^--<-^---^-<-------->--->-<--\n-----<------^-^v^-----------^--<---<->--\n-------^-----^-------<^<--------v---<-->\n-^-<--------v---------<^------------v---\n----><--------><>-------v---v>----------\n^--------><----v----->-----v--<--->v----\n---->---->----------------------v-^--<--\n----<^--------^^------v----v--->-<--<---\n-------^^---^-----v---------^--<>--^vv--\n------^----v------------<<--------------\n----------------------->>-->-----v----v-\n----<----<----<---^<---^------v---------\n---^---------------^-->----^-v-----^----\n--^-v--v-----------><------------vv---v-\n-------v-------------------->->v-------<\n<---><><------<------<-^-v-----^-<^-----\n------>--------v--------->-v>---<-------")); // 6
        assertEquals(3, ld.travel("@--\n---\n---"));
        assertEquals(3, ld.travel("@--\n---\n---"));
        assertEquals(3, ld.travel("@--\n---\n---"));
        assertEquals(3, ld.travel("@--\n---\n---"));
        assertEquals(3, ld.travel("@--\n---\n---"));
        assertEquals(3, ld.travel("@--\n---\n---"));
        assertEquals(3, ld.travel("@--\n---\n---"));
    }
}
