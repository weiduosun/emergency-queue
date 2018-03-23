package edu.neu.ccs.cs5004.assignment6.problem1;

import java.util.Objects;

/**
 * represent an generic linked list.
 *
 * @param <X> the type of elements in the list
 */

public class GenericLinkedList<X> implements List<X> {

  private ListNode<X> head;
  private int listSize;

  /**
   * Constructor of concrete list.
   */

  GenericLinkedList() {
    this.head = null;
    this.listSize = 0;
  }

  /**
   * Add an element to the front of the list.
   * Time complexity : O(1)
   */

  @Override
  public void add(X element) {
    if (this.head == null) {
      this.head = new ListNode<X>(element);
    } else {
      this.head = new ListNode<X>(element, this.head);
    }

    this.listSize++;
  }

  /**
   * Adds an element at the specified index.
   * Time complexity : O(n)
   *
   * @param index   the index we want to add the element
   * @param element the element we want to add
   * @throws IndexOutOfBoundsException throws when index out of bounds
   */

  @Override
  public void add(int index, X element) {
    if (index > listSize || index < 0) {
      throw new IndexOutOfBoundsException();
    }

    if (index == 0) {
      this.head = new ListNode<X>(element, this.head);
    } else {
      ListNode<X> cur = head;
      cur = nodeAt(index - 1);
      cur.setNext(new ListNode<X>(element, cur.next()));
    }
    listSize++;
  }

  /**
   * Gets an element located at the specified index.
   * Time complexity : O(n)
   *
   * @param index the index of the element we want
   * @return the element at that index
   * @throws IndexOutOfBoundsException throws when index out of bounds
   */

  @Override
  public X get(int index) {
    if (index > listSize || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      return this.head.first();
    } else {
      ListNode<X> cur = head;
      cur = nodeAt(index);
      return cur.first();
    }
  }

  /**
   * Retrieves the index of an element in the list.
   * Time complexity : O(n)
   *
   * @param element the element we want to find its index
   * @return the index of this element
   * @throws UnsupportedOperationException throws unsupported operation exception
   */

  @Override
  public int indexOf(X element) {
    if (!this.contains(element)) {
      throw new UnsupportedOperationException("this list doesn't contain input element");
    }

    ListNode<X> cur = head;
    int index = 0;

    while (!cur.first().equals(element)) {
      cur = cur.next();
      index++;
    }

    return index;
  }

  /**
   * Check if an list is empty.
   *
   * @return true if the lis is empty, false otherwise
   */

  @Override
  public boolean isEmpty() {
    return listSize == 0;
  }

  /**
   * Remove the element located at the specified index from the list.
   * Time complexity : O(1)
   *
   * @param index the index of element that we want to remove
   * @throws IndexOutOfBoundsException throws when index out of bound
   */

  @Override
  public void remove(int index) {
    if (index < 0 || index >= listSize) {
      throw new IndexOutOfBoundsException();
    }

    if (index == 0) {
      this.head = this.head.next();
    } else {
      ListNode<X> cur = head;
      cur = nodeAt(index - 1);
      ListNode<X> removeNode = cur.next();
      cur.setNext(removeNode.next());
    }
    listSize--;
  }

  /**
   * Get the size of the list.
   * Time complexity : O(1)
   *
   * @return the size of the list
   */

  @Override
  public int size() {
    return listSize;
  }

  /**
   * Check if the list contains specified element.
   * Time complexity : O(n)
   *
   * @param element the element we want to check
   * @return true if the element is in the list, false otherwise
   */

  @Override
  public boolean contains(X element) {
    ListNode<X> cur = head;

    while (cur != null) {
      if (cur.first().equals(element)) {
        return true;
      }

      cur = cur.next();
    }
    return false;
  }

  /**
   * Get the node at given index.
   * Time complexity : O(n)
   *
   * @param index the index to look up
   * @return the node at given index
   */

  private ListNode<X> nodeAt(int index) {
    ListNode<X> cur = this.head;
    for (int i = 0; i < index; i++) {
      cur = cur.next();

    }
    return cur;
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
    GenericLinkedList<?> that = (GenericLinkedList<?>) object;
    return listSize == that.listSize
        && Objects.equals(head, that.head);
  }

  /**
   * the hash code.
   * Time complexity : O(n)
   *
   * @return the hash code.
   */

  @Override
  public int hashCode() {

    return Objects.hash(head, listSize);
  }
}
