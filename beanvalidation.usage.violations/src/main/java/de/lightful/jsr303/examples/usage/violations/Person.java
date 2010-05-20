/*
 * Copyright (c) 2010 Ansgar Konermann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.lightful.jsr303.examples.usage.violations;

import javax.validation.constraints.Min;

public class Person {

  @Min(2000)
  private int yearlyIncome;

  public Person(int yearlyIncome) {
    this.yearlyIncome = yearlyIncome;
  }

  public int getYearlyIncome() {
    return yearlyIncome;
  }
}
