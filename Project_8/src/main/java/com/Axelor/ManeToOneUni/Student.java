package com.Axelor.ManeToOneUni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stuid;
	
	private String name;
	
	private String stuclass;

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuclass() {
		return stuclass;
	}

	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", name=" + name + ", stuclass=" + stuclass + "]";
	}


}
