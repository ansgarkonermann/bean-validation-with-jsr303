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

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.fest.assertions.Assertions.assertThat;

@Test
public class PersonTest {

  private Validator validator;

  @BeforeMethod
  private void setUp() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  public void validationFailsForIncomeBelow2000() {
    Person peter = new Person(1999);
    Set<ConstraintViolation<Person>> violations = validator.validate(peter);

    assertThat(violations.size()).as("Number of violations").isEqualTo(1);
    ConstraintViolation<Person> violation = violations.iterator().next();
    assertThat(violation).as("Single violation").isNotNull();
  }
}
