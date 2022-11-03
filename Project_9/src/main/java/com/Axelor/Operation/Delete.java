package com.Axelor.Operation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToManeBi.Bus;

public class Delete {

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
         EntityManager entityManager = entityManagerFactory.createEntityManager();
         EntityTransaction entityTransaction=entityManager.getTransaction();
         Bus bus=entityManager.find(Bus.class, 7);
         entityTransaction.begin();
         entityManager.remove(bus);
         entityTransaction.commit();

	}

}
