package edu.neu.ccs.cs5004.assignment6.problem3;

/**
 * Urgent Care Queue with nextPatient() running in O(1).
 */
public interface UrgentCareQueue {
  /**
   * Returns the next patient in the queue.
   *
   * @return the next patient (based on the arrival order), without changing the queue.
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  Patient nextPatient();

  /**
   * Removes the next patient (based on the arrival order).
   *
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  void removeNext();

  /**
   * Returns the patient with the highest urgency in the queue, without changing the queue.
   *
   * @return the patient with the highest urgency in the queue, without changing the queue.
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  Patient nextMostUrgent();

  /**
   * Removes the most urgent patient from the queue.
   *
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  void removeMostUrgent();

  /**
   * Adds a patient to the queue, based on his emergency.
   *
   * @param patient a patient
   */
  void add(Patient patient);

  /**
   * Check if the queue is empty.
   *
   * @return true if the queue is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Returns the number of patients in the queue.
   *
   * @return the size of queue
   */
  int size();

  /**
   * Creates an empty emergency queue or an urgent care queue.
   *
   * @return an empty emergency queue
   */
  static IemergencyQueue emptyList() {
    return new EmergencyQueue();
  }
}
