package com.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name="ALIEN_DETAILS")
public class Alien {

	@Id
	@GeneratedValue  //for autogeneration it is surrogate key
	private int id;
	@Column(name="name_alien")
	private String name;
	@Lob
	private String color;

	@ElementCollection
	private Set<Address> listofAddress = new HashSet<>();   // WE HAVE TO USE SET , we cant use implementation class 
	
	//like we shouldnt use private HashSet<Address> listofAddress = new HashSet<>();
		
	
	public Set<Address> getListofAddress() {
		return listofAddress;
	}
	public void setListofAddress(Set<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
