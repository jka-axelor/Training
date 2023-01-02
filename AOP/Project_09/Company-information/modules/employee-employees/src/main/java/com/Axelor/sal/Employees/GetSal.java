package com.Axelor.sal.Employees;

import java.math.BigDecimal;

public class GetSal {

	public BigDecimal getComm(String job)
	{
		System.out.println("hellow Worled");
		if(job.equals("CLERK")) return new BigDecimal(10.00);
		if(job.equals("SALESMAN")) return new BigDecimal(40.00);
		if(job.equals("MANAGER")) return new BigDecimal(50.00);
		if(job.equals("PRESIDENT")) return new BigDecimal(100.00);
		if(job.equals("ANALYST")) return new BigDecimal(60.00);
		else return new BigDecimal(0.00);
	}
	
}
