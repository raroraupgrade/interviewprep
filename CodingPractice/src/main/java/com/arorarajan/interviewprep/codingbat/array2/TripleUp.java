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
 * Problem Statement: http://codingbat.com/prob/p137874 Return true if the array contains,
 * somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
 * 
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class TripleUp {
    public boolean tripleUp(int[] nums) {
        if (nums.length <= 2)
            return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == nums[i + 1] - 1) && (nums[i] == nums[i + 2] - 2))
                return true;
        }
        return false;
    }
}
