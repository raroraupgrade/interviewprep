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
package com.arorarajan.interviewprep.codingbat.string3;

/**
 * Problem Statement: http://codingbat.com/prob/p179479
 * Given a string, return the length of the largest "block" in the string. A
 * block is a run of adjacent chars that are the same.
 * maxBlock("hoopla") -> 2
 *
 * @author Rajan Arora
 * @since Jun 14, 2014
 */
public class MaxBlock {
    public int maxBlock(String str) {
        if (str.length() == 0)
            return 0;
        int maxBlock=0, blockLength=1;
        char blockChar = str.charAt(0);
        for (int i=1; i<str.length(); i++) {
            if  (str.charAt(i) == blockChar)
                blockLength++;
            else {
                blockLength=1;
                blockChar=str.charAt(i);
            }
            if (blockLength > maxBlock)
                maxBlock = blockLength;
        }
        return maxBlock;
    }
}
