package com.abc.itsupport.main;

import java.util.Scanner;

import com.abc.itsupport.interfaces.ICredentials;
import com.abc.itsupport.model.Departments;
import com.abc.itsupport.model.Employee;
import com.abc.itsupport.service.CredentialService;

public class DriverMain {

	public static Scanner scanner = new Scanner(System.in);
	
	private static void displayMenu() {
		
		System.out.println("Please enter the Department from the following:");
		System.out.println("1."+Departments.TECHNICAL);
		System.out.println("2."+Departments.ADMIN);
		System.out.println("3."+Departments.HUMAN_RESOURCE);
		System.out.println("4."+Departments.LEGAL);
	}
	
	public static void main(String[] args) {
		
		
			//Creating one employee from driver class
			Employee employee = new Employee("Aarti","Gauba");
			ICredentials cred = new CredentialService();
			
			displayMenu();
			
			int choice = scanner.nextInt();
			
				switch(choice) {
				
					case 1: {
						employee.setDepartment(Departments.TECHNICAL);
						break;
						}
					case 2: {
						employee.setDepartment(Departments.ADMIN);
						break;
						}
					case 3: {
						employee.setDepartment(Departments.HUMAN_RESOURCE);
						break;
						}
					case 4: {
						employee.setDepartment(Departments.LEGAL);
						break;
						}
					default: {
								System.out.println("You entered the wrong option!!"); 
								//close the scanner and exit normally.
								scanner.close();
								System.exit(0);
							}
					}
				
				
				//Set the HashMap for department name-code to use in generating email
				Departments.setDepartmentCode();
				
				//Set the generated email for the employee
				employee.getEmpDetails().setEmail(cred.generateEmailAddress(employee));
				
				//Set the generated password for the employee
				employee.getEmpDetails().setPassword(cred.generatePassword());
				
				//Display the Employee details
				cred.showCredentials(employee);
				
				scanner.close();
		}
			

	}


