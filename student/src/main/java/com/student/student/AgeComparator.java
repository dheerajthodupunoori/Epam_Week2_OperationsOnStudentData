package com.student.student;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

  /**
  * Overridden compare method to sort student data based on age.
  */
  public int compare(Student o1, Student o2) {
    Student s1 = (Student)o1;
    Student s2 = (Student)o2;
    Integer a1 = s1.getAgeOfStudent();
    Integer a2 = s2.getAgeOfStudent();
    return a1.compareTo(a2);
  }

}
