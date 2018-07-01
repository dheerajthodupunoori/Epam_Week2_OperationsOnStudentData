package com.student.student;

import java.util.Comparator;

public class YearComparator implements Comparator<Student> {

  /**
  * Overridden Compare method to sort student data based on year of the student.
  */
  public int compare(Student o1, Student o2) {
    Student s1 = (Student)o1;
    Student s2 = (Student)o2;
    return s1.getYearOfStudent().compareTo(s2.getYearOfStudent());
  }

}
