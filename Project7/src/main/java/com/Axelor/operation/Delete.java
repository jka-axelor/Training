package com.Axelor.operation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOnebi.Product;

public class Delete {

	public static void main(String[] args) {
		
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
          EntityManager entityManager = entityManagerFactory.createEntityManager();
          EntityTransaction entityTransaction=entityManager.getTransaction();
          Product product = entityManager.find(Product.class, 8);
          entityTransaction.begin();
          entityManager.remove(product);
          entityTransaction.commit();
          entityManager.close();
          entityManagerFactory.close();
	}
}
