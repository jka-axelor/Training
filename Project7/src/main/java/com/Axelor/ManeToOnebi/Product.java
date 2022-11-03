package com.Axelor.ManeToOnebi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "product",targetEntity = Compane.class)
	private List<Compane>companes;
	
	
	
	public Product() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Compane> getCompanes() {
		return companes;
	}
	public void setCompanes(List<Compane> companes) {
		this.companes = companes;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + "]";
	}
	
	
	
	
	
}
