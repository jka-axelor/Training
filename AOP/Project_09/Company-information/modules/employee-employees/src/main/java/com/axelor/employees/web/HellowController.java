package com.axelor.employees.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Axelor.sal.Employees.GetSal;
import com.axelor.employees.db.Employees;
import com.axelor.employees.service.HelloService;
import com.axelor.employees.service.HellowServiceimp;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class HellowController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	public void says(ActionRequest request, ActionResponse response) {

		Employees employees = request.getContext().asType(Employees.class);
		System.err.println(request.getContext().entrySet());
		HelloService helloService = Beans.get(HellowServiceimp.class);
		String somemassage = helloService.say(employees);
		logger.info(somemassage);
		System.err.println("its controller methord" + somemassage);
		response.setFlash(somemassage);
		response.setValue("comm", new GetSal().getComm(employees.getJob()));
	}
	public void say(ActionRequest request, ActionResponse response)
	{
		Employees employees = request.getContext().asType(Employees.class);
		
		HellowServiceimp hellowServiceimp = Beans.get(HellowServiceimp.class);
		
		System.err.println(hellowServiceimp.hello());
		
		response.setFlash(hellowServiceimp.say(employees));
		
		
	}
}
