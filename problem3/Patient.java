package edu.neu.ccs.cs5004.assignment6.problem3;

import java.util.Objects;

/**
 * Represents a patient with respective urgency value and name
 * to be stored within an Emergency Queue.
 */
public class Patient implements Comparable<Patient> {
  private Urgency urgency;
  private Name name;

  /**
   * Create a new patient with urgency.
   *
   * @param urgency given urgency value of the patient
   * @param name of the patient
   */

  public Patient(Urgency urgency, Name name) {
    this.urgency = urgency;
    this.name = name;
  }

  /**
   * Getter for property ’urgency’.
   *
   * @return Value for property ’urgency’.
   */

  public Urgency getUrgency() {
    return this.urgency;
  }

  /**
   * Getter for property ’name’.
   *
   * @return Value for property ’name’.
   */

  public Name getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Patient patient = (Patient) object;
    return Objects.equals(urgency, patient.urgency)
        && Objects.equals(name, patient.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urgency, name);
  }

  /**
   * Compares this object with the specified object for order.  Returns a
   * negative integer, zero, or a positive integer as this object is less
   * than, equal to, or greater than the specified object.
   * @param otherPatient the object to be compared.
   * @return a negative integer, zero, or a positive integer as this object
   *     is less than, equal to, or greater than the specified object.
   * @throws NullPointerException if the specified object is null
   * @throws ClassCastException   if the specified object's type prevents it
   *                              from being compared to this object.
   */
  @Override
  public int compareTo(Patient otherPatient) {
    if (this.urgency.compareTo(otherPatient.urgency) > 0) {
      return 1;
    } else if (this.urgency.compareTo(otherPatient.urgency) == 0) {
      return 0;
    } else {
      return -1;
    }
  }
}
