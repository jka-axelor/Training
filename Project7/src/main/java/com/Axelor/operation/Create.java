package com.Axelor.operation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Axelor.ManeToOnebi.Compane;
import com.Axelor.ManeToOnebi.Product;

public class Create {

	
		public static void main(String[] args) {
			Compane compane =new Compane();
			compane.setName("itc");
			Compane compane1 =new Compane();
			compane1.setName("mnm");
			Compane compane2 =new Compane();
			compane2.setName("mdm");
			Compane compane3 =new Compane();
			compane3.setName("xyx");
			Compane compane4 =new Compane();
			compane4.setName("bab");
			Compane compane5 =new Compane();
			compane5.setName("rrr");
			
			Product product = new Product();
			product.setName("pencil");
			List<Compane>companes=new ArrayList<Compane>();
			companes.add(compane);
			companes.add(compane1);
			companes.add(compane2);
			product.setCompanes(companes);
			compane.setProduct(product);
			compane1.setProduct(product);
			compane2.setProduct(product);
			
			Product product1 = new Product();
			product1.setName("pan");
			List<Compane>companes1=new ArrayList<Compane>();
			companes1.add(compane3);
			companes1.add(compane4);
			product1.setCompanes(companes1);
			compane3.setProduct(product1);
			compane4.setProduct(product1);
			
			Product product2 = new Product();
			product2.setName("book");
			List<Compane>companes2=new ArrayList<Compane>();
			companes2.add(compane5);
			product2.setCompanes(companes2);
		
			compane5.setProduct(product2);
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(product);
			entityManager.persist(product1);
			entityManager.persist(product2);
			entityTransaction.commit();
		}

	}


