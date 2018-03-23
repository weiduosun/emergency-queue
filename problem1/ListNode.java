package edu.neu.ccs.cs5004.assignment6.problem1;

import java.util.Objects;

/**
 * Represents a list node.
 *
 * @param <Y> the type of the element in the list node
 */
public class ListNode<Y> {

  private Y firstElement;
  private ListNode<Y> nextElement;

  /**
   * Constructor for list node.
   *
   * @param element first element in the list
   * @param list    the rest list
   */

  ListNode(Y element, ListNode<Y> list) {
    this.firstElement = element;
    this.nextElement = list;
  }

  /**
   * Constructor for list node.
   *
   * @param element first element in the list
   */

  ListNode(Y element) {
    this.firstElement = element;
    this.nextElement = null;
  }

  /**
   * get the first element in the list.
   * Time complexity : O(1)
   *
   * @return the first element in the list
   */

  Y first() {
    return firstElement;
  }

  /**
   * get the rest elements in the list.
   * Time complexity : O(1)
   *
   * @return the rest elements in the list
   */

  ListNode<Y> next() {
    return nextElement;
  }

  /**
   * set the next pointer.
   * Time complexity : O(1)
   *
   * @param next the list to be set
   */

  void setNext(ListNode<Y> next) {
    this.nextElement = next;
  }

  /**
   * check if an object is equal to this one.
   * Time complexity : O(n)
   *
   * @param object the object to check
   * @return true if they are equal, false otherwise
   */

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    ListNode<?> listNode = (ListNode<?>) object;
    return Objects.equals(firstElement, listNode.firstElement)
        && Objects.equals(nextElement, listNode.nextElement);
  }

  /**
   * the hash code.
   * Time complexity : O(n)
   *
   * @return the hash code.
   */

  @Override
  public int hashCode() {

    return Objects.hash(firstElement, nextElement);
  }
}
