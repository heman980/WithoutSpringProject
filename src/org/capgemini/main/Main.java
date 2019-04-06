package org.capgemini.main;

import org.capgemini.pojo.Employee;
import org.capgemini.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Employee emp = new Employee();
		service.addEmployee(emp);

	}

}
