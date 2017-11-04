package EmployeeClasses;

import java.time.LocalDateTime;
//import java.util.Date; //if i didn't have packages we couldn't do that

public class Employee {

	//lots of properties
	private float Salary;
	private String lastName;
	private String firstName;
	private String jobTitle;
	private String employeeID;
	private LocalDateTime hireDate;
	
	
	public Employee(){
		Salary = 10;
		jobTitle = "Class 1 Employee";
		hireDate = LocalDateTime.now();
		firstName= lastName = "";
		employeeID = "00000000";		
		
	}
	
	
	public void setFirstName(String input)
	{
		firstName = input;
	}

	
	public void setLastName(String input)
	{
		lastName = input;
	}
	
	public float getSalary() {
		return Salary;
	}


	public void setSalary(float salary) {
		Salary = salary;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}


	public LocalDateTime getHireDate() {
		return hireDate;
	}


	public void setHireDate(LocalDateTime hireDate) {
		this.hireDate = hireDate;
	}


	public String getLastName() {
		return lastName;
	}


	public String getFirstName()
	{
		return firstName;
	}
	
	
	
//Methods - does it return anything, is there an input
	
	public void printName(){
		System.out.println(lastName + ", " + firstName + ":" + jobTitle);
	}

		
	
	
}
