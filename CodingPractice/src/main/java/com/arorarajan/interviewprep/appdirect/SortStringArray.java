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
package com.arorarajan.interviewprep.appdirect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Rajan Arora
 * @since Nov 4, 2014
 */
public class SortStringArray {
    public static void sort (String [] input) {
        // Arrays.sort(input,  new StringLengthComparator());
        List<String> output = Arrays.asList(input);
        Collections.sort(output, new StringLengthComparator());
    }
    
    public static void main (String args[]) {
        String [] input = {"abc", "asdsa", "asdkadjk", "a", "asdbjasd"};
        sort(input);
        for (String str : input) {
            System.out.println(" " + str);
        }
    }
}
