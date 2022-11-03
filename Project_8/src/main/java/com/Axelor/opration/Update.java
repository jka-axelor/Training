package com.Axelor.opration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOneUni.School;
import com.Axelor.ManeToOneUni.Student;

public class Update {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		 School school=entityManager.find(School.class,5 );
		 List<Student>list=school.getStudents();
		 entityTransaction.begin();
		 for(Student s : list)
		 {
			 if(s.getStuclass().equals("vii")) 
			 {
				 Student student=s;
				 System.out.println(s);
				 s.setStuclass("x11");
		         entityManager.persist(student);
			 }
		 }
		 if(school.getLocation().equalsIgnoreCase("bls")) school.setLocation("BBSR");
		 entityManager.persist(school);
		entityTransaction.commit();
	}
}
