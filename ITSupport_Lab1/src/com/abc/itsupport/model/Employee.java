package com.abc.itsupport.model;

public class Employee {
	
	String firstName;
	String lastName;
	String department;

	//static company name, same for every employee
	static String companyName="abc";
	
	//Using aggregation since Employee "has-a" relationship to EmployeeCredentials
	EmployeeCredentials empCred;     
	
	//Parameterized Constructor to pass firstName,lastName
		public Employee(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			/*Initializing EmployeeCredentials in the constructor here to avoid
			  nullpointerException while setting it since we are hard-coding
			  Employee name while creating Employee object from DriverMain class. */
			this.empCred = new EmployeeCredentials();
		}
		
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public EmployeeCredentials getEmpDetails() {
		return empCred;
	}

	public static String getCompanyName() {
		return companyName;
	}

}
