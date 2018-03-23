package edu.neu.ccs.cs5004.assignment6.problem2;

import java.util.Comparator;

public interface PriorityQueue<X> {

  /**
   * insert the element in the queue.
   * Time complexity : O(n)
   *
   * @param element the element to be inserted
   */
  void insert(X element);

  /**
   * remove the object from the front.
   * Time complexity : O(1)
   */

  void remove();

  /**
   * return the object at the front without changing the priority queue.
   * Time complexity : O(1)
   *
   * @return the front without changing the priority queue.
   * @throws IllegalOperationException Illegal Operation Exception
   */

  X front();

  /**
   * check if the queue is empty.
   * Time complexity : O(1)
   *
   * @return true if it is empty, false otherwise
   * @throws IllegalOperationException Illegal Operation Exception
   */

  boolean isEmpty();

  /**
   * the size of the queue.
   * Time complexity : O(1)
   *
   * @return the size of the queue
   */

  int size();

  /**
   * create empty generic queue of type X.
   * Time complexity : O(1)
   *
   * @param <Y> the type of element in the queue
   * @return empty priority queue with type Y elements
   */

  static <Y extends Comparable<Y>> PriorityQueue<Y> emptyList() {

    return new GenericPriorityQueue<Y>();
  }

}
