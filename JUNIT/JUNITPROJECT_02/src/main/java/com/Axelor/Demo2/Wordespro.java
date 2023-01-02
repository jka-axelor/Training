package com.Axelor.Demo2;

public class Wordespro {

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
	public boolean itsAnagram(String s1, String s2)
	{
		if(s1.length() != s2.length()) return false;
		while(s1.length()==s2.length() && s1.length() >0  && s2.length() > 0)
		{
			s2=s2.replace(s1.charAt(0)+"", "");
			s1=s1.replace(s1.charAt(0)+"", "");
			
			if(s1.length() != s2.length()) return false;
		}
		return true;
	}
}
