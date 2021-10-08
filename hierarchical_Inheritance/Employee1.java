package com.Java_Practice.hierarchical_Inheritance;

import java.util.Scanner;

public class Employee1 extends Company{
   private String Employee1_name;
   private int Employee1_id;

   public String getEmployee1_name() {
      return Employee1_name;
   }

   public void setEmployee1_name(String employee1_name) {
      Employee1_name = employee1_name;
   }

   public int getEmployee1_id() {
      return Employee1_id;
   }

   public void setEmployee1_id(int employee1_id) {
      Employee1_id = employee1_id;
   }

   public static void main(String[] args) {

      Employee1 Employee1_details = new Employee1();
      Scanner in = new Scanner(System.in);
      //Employee1 Details
      //Company class
      System.out.print("Enter Employee_1 company name : ");
      String Employee1_company_name = in.next();
      Employee1_details.setCompany_name(Employee1_company_name);
      System.out.print("Enter Employee_1 company place : ");
      String Employee1_company_location = in.next();
      Employee1_details.setCompany_location(Employee1_company_location);

      //Employee1 class
      System.out.print("Enter Employee_1 name : ");
      String Employee1_name = in.next();
      Employee1_details.setEmployee1_name(Employee1_name);
      System.out.print("Enter Employee_1 id : ");
      int Employee1_id = in.nextInt();
      Employee1_details.setEmployee1_id(Employee1_id);

      //output
      System.out.println("Employee_1 company name is : " + " " + Employee1_details.getCompany_name());
      System.out.println("Employee_1 company location is : " + " " + Employee1_details.getCompany_location());
      System.out.println("Employee_1 name is : " + " " + Employee1_details.getEmployee1_name());
      System.out.println("Employee_1 id is : " + " " + Employee1_details.getEmployee1_id());
   }
}
