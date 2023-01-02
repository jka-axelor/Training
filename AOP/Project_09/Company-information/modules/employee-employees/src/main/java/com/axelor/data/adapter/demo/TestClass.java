package com.axelor.data.adapter.demo;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/test")
public class TestClass {
	
	@GET
	@Path("/testApi")
	public String testApi() {
		System.err.println("hello executed");
		
		return "Helo";
		
	}

}
