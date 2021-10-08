package com.Java_Practice.hierarchical_Inheritance;

import java.util.Scanner;

public class Employee2 extends Company{
    String Employee2_name;
    int Employee2_id;

    public String getEmployee2_name() {
        return Employee2_name;
    }

    public void setEmployee2_name(String employee2_name) {
        Employee2_name = employee2_name;
    }

    public int getEmployee2_id() {
        return Employee2_id;
    }

    public void setEmployee2_id(int employee2_id) {
        Employee2_id = employee2_id;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Employee2 Employee2_details = new Employee2();

        //Employee2 Details
        //company class
        System.out.print("Enter the Employee2 company name : ");
        String Employee2_company_name = in.next();
        Employee2_details.setCompany_name(Employee2_company_name);
        System.out.print("Enter Employee2 company location : ");
        String Employee2_company_location = in.next();
        Employee2_details.setCompany_location(Employee2_company_location);

        //Employee2 class
        System.out.print("Enter Employee2 employee name : ");
        String Employee2_name = in.next();
        Employee2_details.setEmployee2_name(Employee2_name);
        System.out.print("Enter Employee2 employee id : ");
        int Employee2_id = in.nextInt();
        Employee2_details.setEmployee2_id(Employee2_id);

        //output
        System.out.println("Employee2 Company name is : " + " " + Employee2_details.getCompany_name());
        System.out.println("Employee2 Company location is : " + " " + Employee2_details.getCompany_location());
        System.out.println("Employee2 name is : " + " " + Employee2_details.getEmployee2_name());
        System.out.println("Employee2 id is : " + " " + Employee2_details.getEmployee2_id());

    }
}

