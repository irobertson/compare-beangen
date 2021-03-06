/*
 *  Copyright 2016-present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.compare.mutable;

import java.time.LocalDate;

import lombok.Data;

@Data
public class LombokMutable {
  // NOTES
  // Requires installing Lombok, Eclipse only
  // hacks inside Eclipse compiler
  // can't see generated code in IDE
  // @Data designed for mutable with subclasses

  /**
   * The name of the person.
   */
  private String name;

  /**
   * The date of birth.
   */
  private LocalDate birthDate;

}
