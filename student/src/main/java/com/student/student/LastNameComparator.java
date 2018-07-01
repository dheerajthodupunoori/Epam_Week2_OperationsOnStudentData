package com.student.student;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Student> {

  public int compare(Student o1, Student o2) {

    return o1.getLastNameOfStudent().compareTo(o2.getLastNameOfStudent());
  }

}
