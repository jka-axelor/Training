package com.axelor.employeesModule;

import com.axelor.app.AxelorModule;
import com.axelor.employees.service.HelloService;
import com.axelor.employees.service.HellowServiceimp;
import com.axelor.employees.service.HellowServicesayimp;

public class EmployeesModule extends AxelorModule {

	@Override
	protected void configure() {
		bind(HelloService.class).to(HellowServiceimp.class);
		bind(HellowServiceimp.class).to(HellowServicesayimp.class);
		
	}
}
