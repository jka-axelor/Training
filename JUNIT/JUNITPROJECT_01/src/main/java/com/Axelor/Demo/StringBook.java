package com.Axelor.Demo;

public class StringBook {

	public int itsWord(String s)
	{
		char ar [] = s.toCharArray();
		for(char c : ar)
		{
			if(c == 32) return 0;
		}
		return 1;
	}

	
	
	public boolean itsPalindrome(String s)
	{
		int i = 0 , j = s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i++)!= s.charAt(j--)) return false;
		}
		return true;
	}
	
	
	public String trim_all (String s)
	{
		String [] arr = s.split(" ");
		
		String s1= "";
		for(int i = 0 ; i < arr.length ; i++ )
		{
			s1= s1+arr[i];
		}
		return s1;
	}

	private void display(String s)
	{
		System.out.println(s);
	}
	
	public boolean manager(String s)
	{
	 int n= 	this.itsWord(s);
	 
	 if(n==0) s = this.trim_all(s);;
	return this.itsPalindrome(s);
	}
}






















