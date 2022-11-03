package com.Axelor.Operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToManeBi.Bus;
import com.Axelor.ManeToManeBi.Pacenger;

public class Read {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction= entityManager.getTransaction();
	    entityTransaction.begin();
	    List<Bus>list=entityManager.createQuery("Select b from Bus b").getResultList();
	    for(Bus B:list)
	    {
	    	System.out.println(B);
	    	List<Pacenger>pacengers=B.getPacengers();
	    	for(Pacenger pacenger :pacengers)System.out.println(pacenger);
	    }
	    entityTransaction.commit();

	}

}
