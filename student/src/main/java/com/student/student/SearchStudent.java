package com.student.student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Class to perform search functionality.
 *
 */

public class SearchStudent {
  static Scanner scan = new Scanner(System.in);
  static ArrayList<Student> studentdata;
  
 
   
  
  /**  
   * Constructor for the class.
   * */
  
  SearchStudent(ArrayList<Student> input) {
    SearchStudent.studentdata = input;
  }

  
  /** 
   * Method to perform search operations.
   */
  public void search() {
    System.out.println("Choose your choice based on whoch you want to search the student data");
    System.out.println("1.FirstName" + "\n" + "2.LastName");
    System.out.println("3.Age" + "\n" + "4.Department");
    System.out.println("5.Year");
    int searchChoice = scan.nextInt();
    switch (searchChoice)  {
    
      case 1:System.out.println("You have selected to search the student data based on firstname");
        SearchStudent.studentBasedOnFirstName();
        break;
      case 2:System.out.println("You have selected to search the student data based on lastname");
        SearchStudent.studentBasedOnLastName();
        break;
      case 3:System.out.println("You have selected to search the student data based on age");
        SearchStudent.studentBasedOnAge();
        break;
      case 4:System.out.println("You have selected to search the student data based on Department");
        SearchStudent.studentBasedOnDepartment();
        break;
      case 5:System.out.println("You have selected to search student data based on year");
        SearchStudent.studentBasedOnYear();
        break;
      default:
        System.out.println("Please choose the correct option");
    }
  }

  /**
   * Method to display the student data based on year.
   */
  private static void studentBasedOnYear() {
    System.out.println("Enter the year 1st/2nd/3rd/4th");
    String yearOfStudent = scan.next();
    for (Student s:studentdata) {
      if (yearOfStudent.equalsIgnoreCase(s.getYearOfStudent())) {
        System.out.println("The details of the student are");
        System.out.println("FirstName :" + s.getFirstNameOfStudent());
        System.out.println("LastName :" + s.getLastNameOfStudent());
        System.out.println("Age :" + s.getAgeOfStudent());
        System.out.println("Department :" + s.getDepartmentOfStudent());
        System.out.println("Year :" + s.getYearOfStudent());
      }
    }
  }

  
  /**
   * Method to display student data based on department.
   */

  private static void studentBasedOnDepartment() {
    System.out.println("Enter the Department of the student cse/ece/eee/mech/it");
    String departmentOfStudent = scan.next();
    for (Student s:studentdata) {
      if (departmentOfStudent.equalsIgnoreCase(s.getDepartmentOfStudent())) {
        System.out.println("The details of the student are");
        System.out.println("FirstName :" + s.getFirstNameOfStudent());
        System.out.println("LastName :" + s.getLastNameOfStudent());
        System.out.println("Age :" + s.getAgeOfStudent());
        System.out.println("Department :" + s.getDepartmentOfStudent());
        System.out.println("Year :" + s.getYearOfStudent());
      }
    }
  }

  /**
   * Method to display the student data based on age of the student.
   */

  private static void studentBasedOnAge() {
    System.out.println("Enter the Age of the student ");
    int ageOfStudent = scan.nextInt();
    for (Student s:studentdata) {
      if (ageOfStudent == s.getAgeOfStudent()) {
        System.out.println("The details of the student are");
        System.out.println("FirstName :" + s.getFirstNameOfStudent());
        System.out.println("LastName :" + s.getLastNameOfStudent());
        System.out.println("Age :" + s.getAgeOfStudent());
        System.out.println("Department :" + s.getDepartmentOfStudent());
        System.out.println("Year :" + s.getYearOfStudent());
      }
    }
  }


  /**
  * Method to get student data based on first name.
  */
  
  
  private static void studentBasedOnFirstName() {
    System.out.println("Enter the First Name");
    String userInput = scan.next();
    for (Student s:studentdata) {
      if (userInput.equalsIgnoreCase(s.getFirstNameOfStudent())) {
        System.out.println("The details of the student are");
        System.out.println("FirstName :" + s.getFirstNameOfStudent());
        System.out.println("LastName :" + s.getLastNameOfStudent());
        System.out.println("Age :" + s.getAgeOfStudent());
        System.out.println("Department :" + s.getDepartmentOfStudent());
        System.out.println("Year :" + s.getYearOfStudent());
      }
    }
    

  }

  /**
   *  Method to display the student data based on last name of the student.
   */

  private static void studentBasedOnLastName() {
    System.out.println("Enter the Last Name");
    String userInput = scan.next();
    for (Student s:studentdata) {
      if (userInput.equalsIgnoreCase(s.getLastNameOfStudent())) {
        System.out.println("The details of the student are");
        System.out.println("FirstName :" + s.getFirstNameOfStudent());
        System.out.println("LastName :" + s.getLastNameOfStudent());
        System.out.println("Age :" + s.getAgeOfStudent());
        System.out.println("Department :" + s.getDepartmentOfStudent());
        System.out.println("Year :" + s.getYearOfStudent());
      }
    }
  }

}
