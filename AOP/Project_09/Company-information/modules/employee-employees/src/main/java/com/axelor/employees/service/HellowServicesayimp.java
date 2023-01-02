package com.axelor.employees.service;

import com.axelor.employees.db.Employees;

public class HellowServicesayimp extends HellowServiceimp{
	
	@Override
	public String say(Employees emp) {
		System.err.println("in sub calss of the");
		String massage= super.say(emp)+ " to the Department";
		System.err.println("sending the mass");
		return massage;
	}

}
