package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.programcreek.helloworld.model.Employee;
import com.programcreek.helloworld.service.EmployeeManager;

@Controller
public class EmployeeAddController {
	private EmployeeManager employeeManager = new EmployeeManager();

	@RequestMapping("/showEmployeeForm")
	public ModelAndView getEmployeeForm(){
		System.out.println("In getEmployeeForm method");
		ModelAndView modelAndView = new ModelAndView("employeeAdd");

		modelAndView.addObject("employeeEntity", new Employee());

		return modelAndView;
	}

	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee em){
		System.out.println("In addEmployee method");
		ModelAndView modelAndView = new ModelAndView("employeeList");

		employeeManager.addEmployee(em);
		modelAndView.addObject("employeeList", employeeManager.getEmployeeList());
		
		System.out.println("Finish adding employee : "+em.getFirstName()+" "+em.getLastName());
		System.out.println("Employees new size = "+employeeManager.getEmployeeList().size());

		return modelAndView;
	}
	
}
