package com.Axelor.Operation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.Axelor.ManeToManeBi.Bus;
import com.Axelor.ManeToManeBi.Pacenger;

public class Create {

	public static void main(String[] args) {
		

		Pacenger pacenger=new Pacenger();
		pacenger.setName("AAAAAA");
		pacenger.setPacengerID("p121");
		
		Pacenger pacenger1=new Pacenger();
		pacenger1.setName("BBBBBBB");
		pacenger1.setPacengerID("p232");
		
		Pacenger pacenger2=new Pacenger();
		pacenger2.setName("CCCCCC");
		pacenger2.setPacengerID("p343");
		
		Pacenger pacenger3=new Pacenger();
		pacenger3.setName("DDDDDDD");
		pacenger3.setPacengerID("p454");
		
		Pacenger pacenger4=new Pacenger();
		pacenger4.setName("EEEEEE");
		pacenger4.setPacengerID("p565");
		
		Pacenger pacenger5=new Pacenger();
		pacenger5.setName("FFFFFF");
		pacenger5.setPacengerID("p676");
		
		Bus bus = new Bus();
		bus.setLocation("BBSR");
		bus.setName("TTTTTTTT");
		
		Bus bus1 = new Bus();
		bus1.setLocation("Bls");
		bus1.setName("UUUUUUUUU");
		
		Bus bus2 = new Bus();
		bus2.setLocation("JLS");
		bus2.setName("VVVVVVVVV");
		
		Bus bus3 = new Bus();
		bus3.setLocation("KJP");
		bus3.setName("WWWWWWWWW");
		
		Bus bus4 = new Bus();
		bus4.setLocation("kks");
		bus4.setName("YYYYYYY");
		
		Bus bus5 = new Bus();
		bus5.setLocation("RRR");
		bus5.setName("xxxxxx");
		
		List<Bus> b1=new ArrayList<Bus>();
		b1.add(bus);
		b1.add(bus1);
		b1.add(bus2);
		b1.add(bus3);
		b1.add(bus4);
		b1.add(bus5);
		List<Bus> b2=new ArrayList<Bus>();
		b2.add(bus);
		b2.add(bus1);
		b2.add(bus2);
		b2.add(bus3);
		b2.add(bus4);
		List<Bus> b3=new ArrayList<Bus>();
		b3.add(bus);
		b3.add(bus1);		
		b3.add(bus2);
		b3.add(bus3);
		List<Bus> b4=new ArrayList<Bus>();
		b4.add(bus);
		b4.add(bus1);
		b4.add(bus2);
		List<Bus> b5=new ArrayList<Bus>();
		b5.add(bus);
		b5.add(bus1);
		List<Bus> b6=new ArrayList<Bus>();
		b6.add(bus);
		
		List<Pacenger>p1=new ArrayList<Pacenger>();
		p1.add(pacenger);
		p1.add(pacenger1);
		p1.add(pacenger2);
		p1.add(pacenger3);
		p1.add(pacenger4);
		p1.add(pacenger5);
		
		List<Pacenger>p2=new ArrayList<Pacenger>();
		p2.add(pacenger);
		p2.add(pacenger1);
		p2.add(pacenger2);
		p2.add(pacenger3);
		p2.add(pacenger4);
		List<Pacenger>p3=new ArrayList<Pacenger>();
		p3.add(pacenger);
		p3.add(pacenger1);
		p3.add(pacenger2);
		p3.add(pacenger3);
		List<Pacenger>p4=new ArrayList<Pacenger>();
		p4.add(pacenger);
		p4.add(pacenger1);
		p4.add(pacenger2);
		List<Pacenger>p5=new ArrayList<Pacenger>();
		p5.add(pacenger);
		p5.add(pacenger1);
		List<Pacenger>p6=new ArrayList<Pacenger>();
		p6.add(pacenger);
		
		    bus.setPacengers(p1);
		    bus1.setPacengers(p2);
			bus2.setPacengers(p3);
			bus3.setPacengers(p4);
		    bus4.setPacengers(p5);
			bus5.setPacengers(p6);
			
			pacenger.setBus(b1);
			pacenger1.setBus(b2);
			pacenger2.setBus(b3);
			pacenger3.setBus(b4);
			pacenger4.setBus(b5);
			pacenger5.setBus(b6);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bus);
		entityManager.persist(bus1);
		entityManager.persist(bus2);
		entityManager.persist(bus3);
		entityManager.persist(bus4);
		entityManager.persist(bus5);
		entityTransaction.commit();
		
	}

}
