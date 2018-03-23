//package edu.neu.ccs.cs5004.assignment6.problem3;
//
//public class computeTime {
//  /**
//   * Main method to compute runtime.
//   *
//   * @param args args
//   */
//  public static void main(String[] args) {
//
//    final int times = 1000000;
//    Name name1 = new Name("a", "b");
//    Name name2 = new Name("c", "d");
//    Name name3 = new Name("e", "f");
//    Name name4 = new Name("g", "h");
//    Name name5 = new Name("i", "j");
//    Urgency urgency1 = new Urgency(1);
//    Urgency urgency2 = new Urgency(2);
//    Urgency urgency3 = new Urgency(3);
//    Urgency urgency4 = new Urgency(4);
//    Urgency urgency5 = new Urgency(5);
//    Patient patient1 = new Patient(urgency1, name1);
//    Patient patient2 = new Patient(urgency2, name2);
//    Patient patient3 = new Patient(urgency3, name3);
//    Patient patient4 = new Patient(urgency4, name4);
//    Patient patient5 = new Patient(urgency5, name5);
//    EmergencyQueue emergencyQueue1 = new EmergencyQueue();
//    emergencyQueue1.add(patient5);
//    emergencyQueue1.add(patient3);
//    emergencyQueue1.add(patient1);
//    emergencyQueue1.add(patient2);
//    emergencyQueue1.add(patient4);
//    long time1 = 0;
//    long time2 = 0;
//    long time1Before;
//    long time2Before;
//
//    for (int i = 0; i < times; i++) {
//      Patient patient = emergencyQueue1.nextPatient();
//      time1Before = System.nanoTime();
//      emergencyQueue1.removeNext();
//      time1 += System.nanoTime() - time1Before;
//      emergencyQueue1.add(patient);
//    }
//
//    for (int i = 0; i < times; i++) {
//      Patient patient = emergencyQueue1.nextMostUrgent();
//      time2Before = System.nanoTime();
//      emergencyQueue1.removeMostUrgent();
//      time2 += System.nanoTime() - time2Before;
//      emergencyQueue1.add(patient);
//    }
//
//    System.out.println(time1);
//    System.out.println(time2);
//  }
//}
