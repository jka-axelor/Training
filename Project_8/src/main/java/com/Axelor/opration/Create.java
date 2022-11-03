package com.Axelor.opration;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOneUni.School;
import com.Axelor.ManeToOneUni.Student;

public class Create {

	public static void main(String[] args) {
		


		Student student=new Student();
		student.setName("AAAAAAA");
		student.setStuclass("x");
		
		Student student1=new Student();
		student1.setName("BBBBBBBB");
		student1.setStuclass("ix");
		
		Student student2=new Student();
		student2.setName("CCCCCCC");
		student2.setStuclass("viii");
		
		Student student3=new Student();
		student3.setName("DDDDDD");
		student3.setStuclass("vii");
		
		Student student4=new Student();
		student4.setName("EEEEEEE");
		student4.setStuclass("vi");
		
		Student student5=new Student();
		student5.setName("FFFFFFFF");
		student5.setStuclass("v");
		
		List<Student> list=new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(student3);
		list1.add(student4);
		
		List<Student> list2=new ArrayList<Student>();
		list2.add(student5);
		
		School school=new School();
		school.setLocation("JLS");
		school.setName("St.JCS");
		school.setStudents(list);

		
		School school1=new School();
		school1.setLocation("BLS");
		school1.setName("St.MS");
		school1.setStudents(list1);
		
		
		
		School school2=new School();
		school2.setLocation("BBSR");
		school2.setName("VRS");
		school2.setStudents(list2);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(school);
		entityManager.persist(school1);
		entityManager.persist(school2);
		entityTransaction.commit();
	}

}
