package com.covid.app.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(unique = true,length = 10, nullable = false)
	private String name;
	private String place;
	private Integer numberofOxygenBeds;
	
	
	public Hospital() {}
	public Hospital(String name,String place,Integer numberofOxygenBeds ) {
		this.name = name;
		this.place = place;
		this.numberofOxygenBeds = numberofOxygenBeds;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getNumberofOxygenBeds() {
		return numberofOxygenBeds;
	}
	public void setNumberofOxygenBeds(Integer numberofOxygenBeds) {
		this.numberofOxygenBeds = numberofOxygenBeds;
	}
	
	
}
