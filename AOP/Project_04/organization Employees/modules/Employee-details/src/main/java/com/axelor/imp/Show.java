package com.axelor.imp;

import com.axelor.employees.db.Employees;

public class Show {
public static void priny(Employees e)
{
	String t = e.getTitle();
	System.out.println(t);
	if(t.equalsIgnoreCase("mr") || t.equalsIgnoreCase("mrs")) e.setTitle(null);
	System.out.println(e);
}

public  static void mas()
{

	
	System.out.println("this is invocked");
}
}
