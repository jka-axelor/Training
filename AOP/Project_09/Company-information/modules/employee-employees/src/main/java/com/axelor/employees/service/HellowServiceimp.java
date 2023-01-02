package com.axelor.employees.service;

import com.axelor.employees.db.Employees;
import com.axelor.employees.db.repo.EmployeesRepository;
import com.google.inject.Inject;

public class HellowServiceimp implements HelloService{
	@Inject
	private EmployeesRepository employeeRepo;

	@Override
	public String hello() {
		return "hello  world";
	}

	@Override
	public String say(Employees emp) {
		String name = emp.geteName();
		
		employeeRepo.find((long)9);
		
		return name+" well come";
	}

}
