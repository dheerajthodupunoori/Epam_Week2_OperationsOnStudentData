package com.student.student;

import java.util.Scanner;

public class Student {
  Scanner scan = new Scanner(System.in);
  
  /** To store first name of student.*/
  String firstName;
  
  /** To store last name of student.*/
  String lastName;
  
  /** To store age of student.*/
  int ageOfStudent;
  
  /** To store department of student.*/
  String department;
  
  /** To store year of student.*/
  String year;
  
  Student(String fname,String lname,int age,String department,String year) {
    this.firstName = fname;
    this.lastName = lname;
    this.ageOfStudent = age;
    this.department = department;
    this.year = year;

  }
  
  public String getFirstNameOfStudent() {
    return firstName;
  }
  
  public String getLastNameOfStudent() {
    return lastName;
  }
  
  public int getAgeOfStudent() {
    return ageOfStudent;
  }
  
  public String getDepartmentOfStudent() {
    return department;
  }
  
  public String getYearOfStudent() {
    return year;
  }
}
