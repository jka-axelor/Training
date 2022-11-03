package com.Axelor.ManeToManeBi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Pacenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String PacengerID;
	
	@ManyToMany(cascade = CascadeType.ALL,targetEntity = Bus.class)
	private List<Bus> bus;
	
	public Pacenger() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPacengerID() {
		return PacengerID;
	}
	public void setPacengerID(String pacengerID) {
		PacengerID = pacengerID;
	}
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	@Override
	public String toString() {
		return "Pacenger [id=" + id + ", name=" + name + ", PacengerID=" + PacengerID + "]";
	}
	
}
