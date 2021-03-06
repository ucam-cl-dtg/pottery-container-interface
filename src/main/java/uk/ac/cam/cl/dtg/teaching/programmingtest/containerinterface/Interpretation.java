/*
 * pottery-container-interface - Within-container API for testing programming exercises
 * Copyright © 2015 Andrew Rice (acr31@cam.ac.uk)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package uk.ac.cam.cl.dtg.teaching.programmingtest.containerinterface;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Interpretation {

  public static final String INTERPRETED_PASSED = "PASSED";
  public static final String INTERPRETED_ACCEPTABLE = "ACCEPTABLE";
  public static final String INTERPRETED_FAILED = "FAILED";

  private String id;

  private String result;

  private String explanation;

  /** Create an instance from the fields provided. */
  @JsonCreator
  public Interpretation(
      @JsonProperty("id") String id,
      @JsonProperty("result") String result,
      @JsonProperty("explanation") String explanation) {
    super();
    this.id = id;
    this.result = result;
    this.explanation = explanation;
  }

  public String getId() {
    return id;
  }

  public String getResult() {
    return result;
  }

  public String getExplanation() {
    return explanation;
  }

  @Override
  public String toString() {
    return "Interpretation{"
        + "id='"
        + id
        + '\''
        + ", result='"
        + result
        + '\''
        + ", explanation='"
        + explanation
        + '\''
        + '}';
  }
}
