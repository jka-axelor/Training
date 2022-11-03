package com.Axelor.ManeToManeBi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String name;
    private String location;
    
    @ManyToMany(cascade = CascadeType.ALL,targetEntity = Pacenger.class,mappedBy = "bus")
    private List<Pacenger> pacengers;
    
    
    public Bus() {
		super();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	  public List<Pacenger> getPacengers() { return pacengers; }
	  
	  public void setPacengers(List<Pacenger> pacengers) { 
		  this.pacengers = pacengers; 
		  }
	
	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Bus [bid=" + bid + ", name=" + name + ", location=" + location + "]";
	} 
    
}
