package com.student.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!.
 *
 */

public class App {

  private static final String COMMA_DELIMITER = ",";
  static Scanner scan = new Scanner(System.in);
  
  
  
  
  /**
  * Reading CSV file.
  *
  */
  
  
  public static void main(String[] args) {
    
    ArrayList<Student> studentlist = new ArrayList<Student>();
    String fileName = "C:\\Users\\HOME\\Desktop\\Epam-pre-learning\\student_data.csv";
    BufferedReader br = null;
    
    
    try {
      Path pathToFile = Paths.get(fileName);
      
      br = Files.newBufferedReader(pathToFile);
      String line = "";
      
      
      while ((line = br.readLine()) != null) {
        String[] studentDetails = line.split(COMMA_DELIMITER); 
        
        if (studentDetails.length > 0) {   
          Student s = new Student(studentDetails[0],
                      studentDetails[1],
                      Integer.parseInt(studentDetails[2]),
                      studentDetails[3],
                      studentDetails[4]);
          studentlist.add(s);
        }
      } 
    } catch (Exception e) {
      System.out.println(e); 
    } finally {
      try {
        br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } 
    
    System.out.println("select your choice");
    System.out.println("1.Searching" + "\n" + "2.Sorting");
    int choice = scan.nextInt();
    //System.out.println(choice); 
    switch (choice) {
      case 1: SearchStudent find = new SearchStudent(studentlist);
              find.search();
        break;
      case 2: SortStudent sort = new SortStudent(studentlist);
               sort.doSort();
        break;
      default: System.out.println("Invalid Choice" + "\n" + "please select the valid choice");
    
    }
    
    
  }

}
