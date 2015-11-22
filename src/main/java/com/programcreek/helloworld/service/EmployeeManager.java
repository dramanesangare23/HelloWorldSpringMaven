package com.programcreek.helloworld.service;

import java.util.ArrayList;
import java.util.List;

import com.programcreek.helloworld.model.Employee;

public class EmployeeManager {
	private static List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeManager(){
	}

	public List<Employee> getEmployeeList(){
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList){
		EmployeeManager.employeeList = employeeList;
	}

	public Employee addEmployee(Employee e){
		System.out.println("Adding an employee...");
		Employee employee = new Employee();

		employee.setId(employeeList.size()+1);
		employee.setFirstName(e.getFirstName());
		employee.setLastName(e.getLastName());
		employeeList.add(employee);
		
		return employee;
	}

}