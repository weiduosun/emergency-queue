package edu.neu.ccs.cs5004.assignment6.problem1;

/**
 * represent a generic list.
 *
 * @param <X> the type of elements in the list
 */

public interface List<X> {

  /**
   * Add an element to the front of the list.
   * Time complexity : O(1)
   */

  void add(X element);

  /**
   * Adds an element at the specified index.
   * Time complexity : O(n)
   *
   * @param index   the index we want to add the element
   * @param element the element we want to add
   *
   * @throws IndexOutOfBoundsException throws when index out of bounds
   */

  void add(int index, X element);

  /**
   * Gets an element located at the specified index.
   * Time complexity : O(n)
   *
   * @param index the index of the element we want
   * @return the element at that index
   *
   * @throws IndexOutOfBoundsException throws when index out of bounds
   */

  X get(int index);

  /**
   * Retrieves the index of an element in the list.
   * Time complexity : O(n)
   *
   * @param element the element we want to find its index
   * @return the index of this element
   * @throws UnsupportedOperationException throws unsupported operation exception
   */

  int indexOf(X element);

  /**
   * Check if an list is empty.
   * Time complexity : O(1)
   *
   * @return true if the lis is empty, false otherwise
   */

  boolean isEmpty();

  /**
   * Remove the element located at the specified index from the list.
   * Time complexity : O(1)
   *
   * @param index the index of element that we want to remove
   * @throws IndexOutOfBoundsException throws when index out of bound
   */

  void remove(int index);

  /**
   * Get the size of the list.
   * Time complexity : O(1)
   *
   * @return the size of the list
   */

  int size();

  /**
   * Check if the list contains specified element.
   * Time complexity : O(n)
   *
   * @param element the element we want to check
   * @return true if the element is in the list, false otherwise
   */

  boolean contains(X element);

  /**
   * Create an empty generic linked list.
   * Time complexity : O(1)
   *
   * @param <Y> the type of elements on the list
   * @return an empty linked list of type Y
   */

  static <Y> List<Y> emptyList() {
    return new GenericLinkedList<Y>();
  }
}
