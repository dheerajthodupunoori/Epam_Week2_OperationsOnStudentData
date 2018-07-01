package com.student.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStudent  {
  static Scanner scan = new Scanner(System.in);
  static ArrayList<Student> studentdata;
  
  /**
   *  Constructor.
   */
  public SortStudent(ArrayList<Student> studentlist) {
    SortStudent.studentdata = studentlist;
  }

  /**
   * Method which defines sorting functionalities.
   */
  public void doSort() {
    System.out.println("Enter the category by which you want to sort the student data");
    System.out.println("1.FirstName" + "\n" + "2.LastName");
    System.out.println("3.Age" + "\n" + "4.Department");
    System.out.println("5.Year");
    int sortChoice = scan.nextInt();
    switch (sortChoice) {
      case 1: System.out.println("You have choosed to sort the student data based on First Name\n");
              SortStudent.sortByFirstName();
              break;
      case 2: System.out.println("You have choosed to sort the student data based on Last Name\n");
              SortStudent.sortByLastName();
              break;
      case 3: System.out.println("You have choosed to sort the student data based on Age\n");
              SortStudent.sortByAge();
              break;
      case 4: System.out.println("You have choosed to sort the student data based on Department\n");
              SortStudent.sortByDepartment();
              break;
      case 5: System.out.println("You have choosed to sort the student data based on Year\n");
              SortStudent.sortByYear();
              break;
      default: System.out.println("Please select the valid choice");
    }

  }

  
  /**
  * Method to sort the student data based on year of the student.
  */
  
  
  private static void sortByYear() {
    Collections.sort(studentdata,new YearComparator());
    for (Student s:studentdata) {
      System.out.println("The details of the student are");
      System.out.println("FirstName :" + s.getFirstNameOfStudent());
      System.out.println("LastName :" + s.getLastNameOfStudent());
      System.out.println("Age :" + s.getAgeOfStudent());
      System.out.println("Department :" + s.getDepartmentOfStudent());
      System.out.println("Year :" + s.getYearOfStudent());
      System.out.println("\n" + "\n");
    }
  }

  /** 
   * Method to sort the student data based on department of the student.
   */
  
  private static void sortByDepartment() {
    Collections.sort(studentdata,new DepartmentComparator());
    for (Student s:studentdata) {
      System.out.println("The details of the student are");
      System.out.println("FirstName :" + s.getFirstNameOfStudent());
      System.out.println("LastName :" + s.getLastNameOfStudent());
      System.out.println("Age :" + s.getAgeOfStudent());
      System.out.println("Department :" + s.getDepartmentOfStudent());
      System.out.println("Year :" + s.getYearOfStudent());
      System.out.println("\n" + "\n");
    }
  }

  /**
   * Method to sort the student data based on age of the student.
   */
  
  private static void sortByAge() {
    Collections.sort(studentdata,new AgeComparator());
    for (Student s:studentdata) {
      System.out.println("The details of the student are");
      System.out.println("FirstName :" + s.getFirstNameOfStudent());
      System.out.println("LastName :" + s.getLastNameOfStudent());
      System.out.println("Age :" + s.getAgeOfStudent());
      System.out.println("Department :" + s.getDepartmentOfStudent());
      System.out.println("Year :" + s.getYearOfStudent());
      System.out.println("\n" + "\n");
    }
  }

  /**
   * Method to sort the student data based on last name of the student.
   */
  
  private static void sortByLastName() {
    Collections.sort(studentdata,new LastNameComparator());
    for (Student s:studentdata) {
      System.out.println("The details of the student are");
      System.out.println("FirstName :" + s.getFirstNameOfStudent());
      System.out.println("LastName :" + s.getLastNameOfStudent());
      System.out.println("Age :" + s.getAgeOfStudent());
      System.out.println("Department :" + s.getDepartmentOfStudent());
      System.out.println("Year :" + s.getYearOfStudent());
      System.out.println("\n" + "\n");
    }
  }

  /** 
   * Method to sort the student data based on first name of the student.
   */
  private static void sortByFirstName() {
    Collections.sort(studentdata,new FirstNameComparator());
    for (Student s:studentdata) {
      System.out.println("The details of the student are");
      System.out.println("FirstName :" + s.getFirstNameOfStudent());
      System.out.println("LastName :" + s.getLastNameOfStudent());
      System.out.println("Age :" + s.getAgeOfStudent());
      System.out.println("Department :" + s.getDepartmentOfStudent());
      System.out.println("Year :" + s.getYearOfStudent());
      System.out.println("\n" + "\n");
    }
  }

 


 


}
