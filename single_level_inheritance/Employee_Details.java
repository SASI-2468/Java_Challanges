package com.Java_Practice.single_level_inheritance;

import java.util.Scanner;

public class Employee_Details extends Employee{
    private int employee_id;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public static void main(String[] args) {
        Employee_Details Employee1 = new Employee_Details();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee name  : ");
        String Employee_name = in.next();
        Employee1.setName(Employee_name);

        System.out.print("Enter Employee company  : ");
        String Employee_company = in.next();
        Employee1.setCompany(Employee_company);

        System.out.print("Enter Employee ID : ");
        int Employee_id = in.nextInt();
        Employee1.setEmployee_id(Employee_id);
        System.out.println("Employee name is :" + " "  + Employee1.getName());
        System.out.println("Employee company is :" + " "  + Employee1.getCompany());
        System.out.println("Employee id is :" + " "  + Employee1.getEmployee_id());
    }
}
