package org.emp;

import java.util.Scanner;

public class EmployeeDetails {
	
	public static Scanner sc;

	public static void main(String[] args) {
		
	sc = new Scanner(System.in);
	
	System.out.println("Enter your City");
    String empCity =sc.nextLine();
    System.out.println("My City:"+empCity);
	
	System.out.println("Enter your Employee ID");
    short empId= sc.nextShort();
    System.out.println("My Employee ID:"+empId);
    
    System.out.println("Enter Your Name");
    String empName = sc.next();
    System.out.println("My Name:"+empName);
    
    System.out.println("Enter Your EMAIL Id");
    String empEmail = sc.next();
    System.out.println("My EMAIL:"+empEmail);
    
    System.out.println("Enter your Phone Number");
    long empPhoneNo = sc.nextLong();
    System.out.println("My Phone No:"+empPhoneNo);
    
    System.out.println("Enter your Salary");
    float empSalary = sc.nextFloat();
    System.out.println("My Salary:"+empSalary);
    
    System.out.println("Enter your Gender");
    String empGender = sc.next();
    System.out.println("My Gender:"+empGender);
    
    
    System.out.println("hello");
    System.out.println("hi");
    
}	
}	
	
	
	
	
	
	
	


