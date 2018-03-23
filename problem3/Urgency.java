package edu.neu.ccs.cs5004.assignment6.problem3;

import java.util.Objects;

/**
 * Represents an urgency.
 */
public class Urgency {
  private Integer value;

  /**
   * Constructor for Urgency.
   *
   * @param value value
   */
  public Urgency(Integer value) {
    this.value = value;
  }

  /**
   * compares two urgency values.
   * @param otherUrgency to compare with (assumed to be not null)
   * @return 1 if this urgency value is bigger than other urgency value
   *     -1 if this urgency value if smaller than other urgency value.
   *     0 if both urgency values are equal.
   */
  public int compareTo(Urgency otherUrgency) {
    if (this.value > otherUrgency.value) {
      return 1;
    } else if (this.value < otherUrgency.value) {
      return -1;
    } else {
      return 0;
    }
  }

  /**
   * Getter for value.
   *
   * @return an urgent value
   */
  public Integer getValue() {
    return value;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Urgency urgency = (Urgency) object;
    return Objects.equals(value, urgency.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
