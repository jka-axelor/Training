package com.Axelor.opration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOneUni.School;

public class Read {
	
	public static void main(String[] args) {
		
	

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction= entityManager.getTransaction();
    entityTransaction.begin();
    List<School>list=entityManager.createQuery("Select s from School s").getResultList();
    for(School s:list)System.out.println(s);
    entityTransaction.commit();

}
}
