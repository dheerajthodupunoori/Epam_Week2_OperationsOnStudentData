package com.student.student;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Student> {

  public int compare(Student o1, Student o2) {
    return o1.getFirstNameOfStudent().compareTo(o2.getFirstNameOfStudent());
  }

}
