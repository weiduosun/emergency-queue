package edu.neu.ccs.cs5004.assignment6.problem2;

import edu.neu.ccs.cs5004.assignment6.problem1.List;

import java.util.Comparator;
import java.util.Objects;

/**
 * Represent a generic priority queue.
 *
 * @param <X> the type of elements in the generic priority queue
 */
public class GenericPriorityQueue<X extends Comparable<X>> implements PriorityQueue<X> {
  private List<X> queue;

  /**
   * constructor of generic priority queue.
   */

  GenericPriorityQueue() {
    this.queue = List.emptyList();
  }

  /**
   * insert the element in the queue.
   * Time complexity : O(n^2)
   *
   * @param element the element to be inserted
   */

  @Override
  public void insert(X element) {
    int numberOfElement = queue.size();

    int insertIndex = 0;

    for (int i = 0; i < numberOfElement; i++) {
      if (element.compareTo(queue.get(i)) <= 0) {
        insertIndex++;
      }
    }

    queue.add(insertIndex, element);
  }

  /**
   * remove the object from the front.
   * Time complexity : O(1)
   */

  @Override
  public void remove() {
    if (queue.size() == 0) {
      throw new IllegalOperationException("Cannot remove an element from an empty queue");
    }
    queue.remove(0);
  }

  /**
   * return the object at the front without changing the priority queue.
   * Time complexity : O(1)
   *
   * @return the front without changing the priority queue.
   */

  @Override
  public X front() {
    if (queue.size() == 0) {
      throw new IllegalOperationException("Cannot check an element from an empty queue");
    }
    return queue.get(0);
  }

  /**
   * check if the queue is empty.
   * Time complexity : O(1)
   *
   * @return true if it is empty, false otherwise
   */

  @Override
  public boolean isEmpty() {
    return queue.isEmpty();
  }

  /**
   * the size of the queue.
   * Time complexity : O(1)
   *
   * @return the size of the queue
   */

  @Override
  public int size() {
    return queue.size();
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
    GenericPriorityQueue<?> that = (GenericPriorityQueue<?>) object;
    return Objects.equals(queue, that.queue);
  }

  /**
   * the hash code.
   * Time complexity : O(n)
   *
   * @return the hash code.
   */

  @Override
  public int hashCode() {

    return Objects.hash(queue);
  }
}
