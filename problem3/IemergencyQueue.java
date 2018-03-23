package edu.neu.ccs.cs5004.assignment6.problem3;

/**
 * Represents an emergency queue.
 */
public interface IemergencyQueue {

  /**
   * Returns the next patient in the queue.
   * This is an observer.
   * @return the next patient (based on the arrival order), without changing the queue.
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  Patient nextPatient();

  /**
   * Removes the next patient (based on the arrival order).
   * This is a mutator.
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  void removeNext();

  /**
   * Returns the patient with the highest urgency in the queue, without changing the queue.
   * This is an observer.
   * @return the patient with the highest urgency in the queue, without changing the queue.
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  Patient nextMostUrgent();

  /**
   * Removes the most urgent patient from the queue.
   * This is a mutator.
   *
   * @throws EmergencyQueueIllegalOperationException if the queue is empty
   */
  void removeMostUrgent();

  /**
   * Adds a patient to the queue, based on his emergency.
   * This is a mutator.
   *
   * @param patient a patient
   */
  void add(Patient patient);

  /**
   * Check if the queue is empty.
   * This is an observer.
   *
   * @return true if the queue is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Returns the number of patients in the queue.
   * This is an observer.
   *
   * @return the size of queue
   */
  int size();

  /**
   * Creates an empty emergency queue or an urgent care queue.
   * This is a creator.
   *
   * @return an empty emergency queue
   */
  static IemergencyQueue emptyList() {
    return new EmergencyQueue();
  }
}
