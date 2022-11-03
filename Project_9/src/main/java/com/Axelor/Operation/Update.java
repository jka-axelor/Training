package com.Axelor.Operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToManeBi.Bus;
import com.Axelor.ManeToManeBi.Pacenger;

public class Update {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Bus bus = entityManager.find(Bus.class, 7);
		System.out.println(bus);
		List<Pacenger>pacengers=bus.getPacengers();
		entityTransaction.begin();
		for(Pacenger p: pacengers)
		{
			if(p.getName().equalsIgnoreCase("aaaaaa"))
			{
				p.setName("xxxxx");
				entityManager.persist(p);
			}
		}
		if(bus.getLocation().equalsIgnoreCase("kjp"))
			bus.setLocation("mmm");
		entityManager.persist(bus);
		entityTransaction.commit();
	}

}
