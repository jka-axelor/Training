package com.Axelor.Demo;

public class Stringtest implements Comparable<String>, EqualsTest<String> {

	@Override
	public String createbook() {
		// TODO Auto-generated method stub
		return "book1";
	}

	@Override
	public String createvalue() {
		// TODO Auto-generated method stub
		return "book2";
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
