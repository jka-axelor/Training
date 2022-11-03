package com.Axelor.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOnebi.Compane;
import com.Axelor.ManeToOnebi.Product;

public class Read {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction= entityManager.getTransaction();
	    entityTransaction.begin();
	    List<Product>list=entityManager.createQuery("Select p from Product p").getResultList();
	    for(Product p:list) 
	    {
	    	System.out.println(p);
	    	List<Compane> companes=p.getCompanes();
	    	for(Compane compane :companes )System.out.println(compane);
	    	
	    	}
	    	
	    entityTransaction.commit();
	   

	}

}
