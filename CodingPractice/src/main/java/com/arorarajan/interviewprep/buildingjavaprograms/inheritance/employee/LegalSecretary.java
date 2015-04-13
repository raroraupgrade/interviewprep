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
package com.arorarajan.interviewprep.buildingjavaprograms.inheritance.employee;

/**
 * @author Rajan Arora
 * @since Oct 16, 2014
 */
public class LegalSecretary extends Secretary {
    public double getSalary() {
        return super.getSalary() + 5000.0; // $45,000.00 / year
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}