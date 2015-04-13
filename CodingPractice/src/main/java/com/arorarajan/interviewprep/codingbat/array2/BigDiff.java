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
package com.arorarajan.interviewprep.codingbat.array2;

/**
 * Problem Statement: http://codingbat.com/prob/p196640 Given an array length 1 or more of ints,
 * return the difference between the largest and smallest values in the array. Note: the built-in
 * Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
 * 
 * bigDiff({10, 3, 5, 6}) -> 7
 * 
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class BigDiff {
    public int bigDiff(int[] nums) {
        if (nums.length == 1)
            return 0;
        int maxVal=nums[0], minVal=nums[0];
        for (int i=0; i<nums.length; i++) {
            minVal = Math.min (minVal,nums[i]);
            maxVal = Math.max (maxVal,nums[i]);
        }
        return (maxVal-minVal);
    }
}
