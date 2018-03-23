package edu.neu.ccs.cs5004.assignment6.problem3;

import edu.neu.ccs.cs5004.assignment6.problem1.List;
import edu.neu.ccs.cs5004.assignment6.problem2.PriorityQueue;

import java.util.Objects;

/**
 * Represents an emergency queue.
 */
public class EmergencyQueue implements IemergencyQueue, UrgentCareQueue {

  private PriorityQueue<Patient> urgencyQueue;
  private List<Patient> orderList;

  /**
   * Constructor for emergency queue.
   */
  EmergencyQueue() {
    this.urgencyQueue = PriorityQueue.emptyList();
    this.orderList = List.emptyList();
  }

  /**
   * Returns the next patient in the queue.
   * Runtime complexity: 0(1)
   *
   * @return the next patient (based on the arrival order), without changing the queue.
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  @Override
  public Patient nextPatient() {
    if (orderList.size() == 0) {
      throw new EmergencyQueueIllegalOperationException("Cannot check a "
          + "patient from an empty queue");
    }
    return orderList.get(0);
  }

  /**
   * Removes the next patient (based on the arrival order).
   * Runtime complexity: O(n^2). Its runtime complexity is the twice of removeMostUrgent.
   * Since we need to rebuild the urgency queue, the for loop will not stop in advance.
   * The average system time takes 177696440 when it runs 1000000 times.
   *
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  @Override
  public void removeNext() {
    if (orderList.size() == 0) {
      throw new EmergencyQueueIllegalOperationException("Cannot remove a "
          + "patient from an empty queue");
    }
    int size = orderList.size();
    orderList.remove(0);
    PriorityQueue<Patient> temp = PriorityQueue.emptyList();
    for (int i = 0; i < size - 1; i++) {
      temp.insert(orderList.get(i));
    }
    urgencyQueue = temp;
  }

  /**
   * Returns the patient with the highest urgency in the queue, without changing the queue.
   *
   * @return the patient with the highest urgency in the queue, without changing the queue.
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  @Override
  public Patient nextMostUrgent() {
    if (orderList.size() == 0) {
      throw new EmergencyQueueIllegalOperationException("Cannot check a "
          + "patient from an empty queue");
    }
    return urgencyQueue.front();
  }

  /**
   * Removes the most urgent patient from the queue.
   * Runtime complexity: O(n^2). Its runtime complexity is the same as removeNext.
   * However, when it finds the patient we need to remove, the for loop will stop in advance.
   * The average time complexity of the for loop is about O(1/2*n) = O(n).
   * The average system time takes 81943812 when it runs 1000000 times,
   *
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  @Override
  public void removeMostUrgent() {
    if (orderList.size() == 0) {
      throw new EmergencyQueueIllegalOperationException("Cannot remove a "
          + "patient from an empty queue");
    }
    Patient mostUrgent = urgencyQueue.front();
    urgencyQueue.remove();
    int size = orderList.size();
    for (int i = 0; i < size; i++) {
      if (orderList.get(i).equals(mostUrgent)) {
        orderList.remove(i);
        break;
      }
    }
  }

  /**
   * Adds a patient to the queue, based on his emergency.
   *
   * @param patient a patient
   */

  @Override
  public void add(Patient patient) {
    urgencyQueue.insert(patient);
    orderList.add(size() - 1, patient);
  }

  /**
   * Check if the queue is empty.
   *
   * @return true if the queue is empty, false otherwise
   */
  @Override
  public boolean isEmpty() {
    return urgencyQueue.isEmpty();
  }

  /**
   * Returns the number of patients in the queue.
   *
   * @return the size of queue
   */
  @Override
  public int size() {
    return urgencyQueue.size();
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    EmergencyQueue that = (EmergencyQueue) object;
    return Objects.equals(urgencyQueue, that.urgencyQueue)
        && Objects.equals(orderList, that.orderList);
  }

  @Override
  public int hashCode() {

    return Objects.hash(urgencyQueue, orderList);
  }
}
