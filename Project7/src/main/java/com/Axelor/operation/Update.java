package com.Axelor.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOnebi.Compane;
import com.Axelor.ManeToOnebi.Product;

public class Update {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		 Product product=entityManager.find(Product.class,5 );
		 List<Compane>companes=product.getCompanes();
		 entityTransaction.begin();
		 for(Compane c : companes)
		 {
			 if(c.getName().equalsIgnoreCase("bab")) 
			 {
				 Compane com = c;
				 System.out.println(c);
				 com.setName("apsara");
		         entityManager.persist(com);
			 }
		 }
		 if(product.getName().equalsIgnoreCase("pan")) product.setName("useandthrowpan");
		 entityManager.persist(product);
		entityTransaction.commit();

	}

}
