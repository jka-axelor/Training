package com.Axelor.opration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOneUni.School;
import com.Axelor.ManeToOneUni.Student;

public class Delete {

     public static void main(String[] args) {
		
           EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
           EntityManager entityManager = entityManagerFactory.createEntityManager();
           EntityTransaction entityTransaction=entityManager.getTransaction();
          School school=entityManager.find(School.class,8 );
          entityTransaction.begin();
          entityManager.remove(school);
	      entityTransaction.commit();
	}
	
}
