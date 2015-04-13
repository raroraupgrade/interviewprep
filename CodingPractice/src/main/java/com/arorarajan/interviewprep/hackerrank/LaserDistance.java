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

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rajan Arora
 * @since Nov 9, 2014
 */
public class LaserDistance {
    // Maintain laser travel history
    private Set<Integer> history;
    private Direction direction;
 
    private CoOrdinate advance(char[][] input, CoOrdinate co) {
        if (input[co.x][co.y] == '^') {
            direction = Direction.NORTH;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == '>') {
            direction = Direction.EAST;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == '<') {
            direction = Direction.WEST;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == 'v') {
            direction = Direction.SOUTH;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == '\\' && direction == Direction.SOUTH) {
            direction = Direction.EAST;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == '\\' && direction == Direction.WEST) {
            direction = Direction.NORTH;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == '/' && direction == Direction.EAST) {
            direction = Direction.NORTH;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == '/' && direction == Direction.SOUTH) {
            direction = Direction.WEST;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == 'O' && direction == Direction.NORTH) {
            direction = Direction.SOUTH;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == 'O' && direction == Direction.EAST) {
            direction = Direction.WEST;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == 'O' && direction == Direction.WEST) {
            direction = Direction.EAST;
            return nextCoOrdinate(co);
        } else if (input[co.x][co.y] == 'O' && direction == Direction.SOUTH) {
            direction = Direction.NORTH;
            return nextCoOrdinate(co);
        } else
            // '@' or '-'
            return nextCoOrdinate(co);
    }

    private CoOrdinate nextCoOrdinate(CoOrdinate co) {
        if (direction == Direction.NORTH)
            return new CoOrdinate(co.x -1, co.y);
        else if (direction == Direction.EAST)
            return new CoOrdinate(co.x, co.y + 1);
        else if (direction == Direction.WEST)
            return new CoOrdinate(co.x, co.y - 1);
        else if (direction == Direction.SOUTH)
            return new CoOrdinate(co.x + 1, co.y);
        else
            return null;
    }

    private boolean isWall(CoOrdinate co, int maxX, int maxY) {
        if (co.x == -1 || co.y == -1)
            return true;
        if (co.x > maxX)
            return true;
        if (co.y > maxY)
            return true;
        return false;
    }

    private void recordCoOrdinateInHistory(CoOrdinate co) {
        history.add((Integer) co.getCoOrdinateAsInt());
    }

    public int travel(String input) {
        int distance = 0;
        CoOrdinate startingPoint = null;
        CoOrdinate currPosition;
        history = new HashSet<>();
        String[] rows = input.split("\n", 0);
        int maxX = rows[0].length();
        int maxY = rows.length;
        char[][] inputAsChar = new char[maxY][maxX];
        for (int i = 0; i < maxY; i++) {
            inputAsChar[i] = (char[]) rows[i].toCharArray();
            if (rows[i].contains("@"))
                startingPoint = new CoOrdinate(rows[i].indexOf('@'), i);
        }

        direction = Direction.EAST;
        currPosition = advance(inputAsChar, startingPoint);
        ++distance;

        while (true) {
            if (isWall(currPosition, maxX-1, maxY-1))
                return distance;
            //else if (history.contains(currPosition.getCoOrdinateAsInt())) {
                // TODO Infinite loop detection logic goes here and if loop found, return -1;
            //}
            // Current check to avoid infinite loops
            else if (distance > 150)
                return -1;
            else {
                ++distance;
                recordCoOrdinateInHistory(currPosition);
                currPosition = advance(inputAsChar, currPosition);
            }
        }
    }

}
