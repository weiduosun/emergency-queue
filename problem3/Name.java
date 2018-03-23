package edu.neu.ccs.cs5004.assignment6.problem3;

import java.util.Objects;

/**
 * Represents the Name with the first name and last name.
 */
public class Name {

  private String firstName;
  private String lastName;

  /**
   * Creates a new Name with the given first name, and last name.
   *
   * @param firstName the name's first name
   * @param lastName  the name's last name
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Getter for property 'firstName'.
   *
   * @return Value for property 'firstName'.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Getter for property 'lastName'.
   *
   * @return Value for property 'lastName'.
   */
  public String getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Name name = (Name) object;
    return Objects.equals(firstName, name.firstName)
        && Objects.equals(lastName, name.lastName);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    return "Name{"
        + "firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + '}';
  }
}
