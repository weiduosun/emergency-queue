package edu.neu.ccs.cs5004.assignment6.problem2;

/**
 * Represents an illegal operation on a queue.
 */
public class IllegalOperationException extends RuntimeException {

  /**
   * Constructor for IllegalOperationException.
   */
  public IllegalOperationException(String msg) {
    super(msg);
  }
}
