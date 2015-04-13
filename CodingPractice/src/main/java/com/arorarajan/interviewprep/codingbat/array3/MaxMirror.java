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
 * @author Rajan Arora
 * @since Sep 29, 2014
 */
public class MaxMirror {
    public int maxMirror(int[] nums) {
        if (nums.length == 1)
            return 1;
        int maxMirror = 0;
        for (int i = 0; i < nums.length; i++) {
            int mirrorLength = 0;
            for (int j = nums.length - 1; i+mirrorLength < nums.length && j >= 0; j--) {
                if (nums[i + mirrorLength] == nums[j]) {
                    mirrorLength++;
                } else {
                    maxMirror = Math.max(mirrorLength, maxMirror);
                    mirrorLength=0;
                }
            }
            maxMirror = Math.max(mirrorLength, maxMirror);
        }
        return maxMirror;
    }
}