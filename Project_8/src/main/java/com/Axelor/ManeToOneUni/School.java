package com.Axelor.ManeToOneUni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scid;
	
	private String name;
	
	private String location;

	@OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
	private List<Student> students;

	public School() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "School [scid=" + scid + ", name=" + name + ", location=" + location + ", students=" + students + "]";
	}

	
}
