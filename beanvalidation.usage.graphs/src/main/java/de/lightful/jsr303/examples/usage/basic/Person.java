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

package de.lightful.jsr303.examples.usage.basic;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class Person {

  @Valid
  private List<Income> incomes;

  public Person() {
    incomes = new ArrayList<Income>();
  }

  public void addIncome(Income income) {
    incomes.add(income);
  }

  public List<Income> getIncomes() {
    return incomes;
  }
}
