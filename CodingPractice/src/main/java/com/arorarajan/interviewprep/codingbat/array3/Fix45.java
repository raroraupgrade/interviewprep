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
 * Problem Statement: http://codingbat.com/prob/p125819 Return an array that contains exactly the
 * same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5.
 * Do not move the 4's, but every other number may move. The array contains the same number of 4's
 * and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear
 * anywhere in the original array.
 * 
 * @author Rajan Arora
 * @since Jun 15, 2014
 */
public class Fix45 {
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4) {
                if (nums[i + 1] == 5)
                    continue;
                int j = 0;
                if (!(nums[j] == 5)) {
                    for (j = 1; j < nums.length; j++) {
                        if (nums[j] == 5 && !(nums[j - 1] == 4))
                            break;
                    }
                }
                int temp = nums[i + 1];
                nums[i + 1] = 5;
                nums[j] = temp;
            }
        }
        return nums;
    }
}
