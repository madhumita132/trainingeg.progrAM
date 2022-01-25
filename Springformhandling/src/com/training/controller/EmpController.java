package com.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.bean.Employee;

@Controller
public class EmpController {
	@RequestMapping("/EmpRequestHandler")
	public ModelAndView showEmployeeForm() {
		
		/*Syntax: return new ModelAndView("redirectingResponsePage",
		"command key for input mapping",model name)*/
		return new ModelAndView("EmpregForm","command",new Employee());
	}
	//@ModelAttribute is a Spring MVC specific annotation which is used for preparing the model data
	//it is also used to define the command object that would be bound with the HTTP request data.
	//The anotation works only if the class is controller class
	 @RequestMapping(value="/SaveEmployeeInfoHandler",method=RequestMethod.POST)
	 public ModelAndView saveEmpModelDetails(@ModelAttribute Employee emp) {
		 System.out.println("Employee id: " + emp.getId() + "Employee Name: " + emp.getName() + 
				 "Salary: " + emp.getSalary() + "Designation: " +emp.getDesignation());
		 
		 System.out.println("Now controll will be transferred from 'SaveEmployeInfoHandler' to 'EmpRegFrom;" + "as a response through Dispatcher Servlet");
		 
		 //Here, the model 'emp' object maps the data form its object variable to HTTP page input controlls
		// return new ModelAndView("EmpregForm", "command",emp);
		 
		 
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("empBean", emp);
		 mav.setViewName("display");
		 return mav;
		 
		// return new ModelAndView("display","empBean",emp);
	 }
	 @RequestMapping("/view_ret_data")
	 public ModelAndView viewemp(@ModelAttribute Employee emp) {
		 System.out.println("This 'Controller' is created to show the collection object Model' in 'view'");
		 
		 List<Employee>list=new ArrayList<Employee>();
		 list.add(new Employee(emp.getId(),emp.getName(),emp.getSalary(),emp.getDesignation()));
		 list.add(new Employee(2,"Dharani",25000f,"IT Manager"));
		 list.add(new Employee(3,"Sachin",55000f,"Trainer"));
		 
		 return new ModelAndView("view_ret_data","listData",list);
	 }
	 @RequestMapping("/viewToRedirect")  
		public ModelAndView viewDirect(){  
		            System.out.println("This 'handler' is created to show the redirection of external application");
		            return new ModelAndView("redirect:https://www.google.co.in");
	    }

	 
	 
	 }


