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

/**
 * Problem Statement: http://codingbat.com/prob/p189576 Consider the leftmost and righmost
 * appearances of some value in an array. We'll say that the "span" is the number of elements
 * between the two inclusive. A single value has a span of 1. Returns the largest span found in the
 * given array. (Efficiency is not a priority.)
 * 
 * @author Rajan Arora
 * @since Jun 15, 2014
 */
public class MaxSpan {
    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            int span = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    span = (j - i) + 1;
            }
            if (span > maxSpan)
                maxSpan = span;
        }
        return maxSpan;
    }
}
