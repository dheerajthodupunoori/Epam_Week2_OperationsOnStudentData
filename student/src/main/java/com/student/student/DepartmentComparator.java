package com.student.student;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Student> {

  public int compare(Student o1, Student o2) {
    return o1.getDepartmentOfStudent().compareTo(o2.getDepartmentOfStudent());
  }

}
