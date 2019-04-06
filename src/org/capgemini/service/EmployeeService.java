package org.capgemini.service;

import org.capgemini.dao.EmployeeDao;
import org.capgemini.pojo.Employee;

public class EmployeeService {
	
	//EmployeeDao is dependency for EmployeeService and we should not create using new operator 
	//instead we should ask for spring framework to give that dependency
	
	EmployeeDao dao = new EmployeeDao();
	public void addEmployee(Employee emp)
	{
		System.out.println("add employee service is called");
		dao.createEmployee(emp);
		
	}

}
