package com.hibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Lob;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "ALIEN_DETAILS")
public class Alien {

	@Id
	@GeneratedValue // for autogeneration it is surrogate key
	private int id;
	@Column(name = "name_alien")
	private String name;
	@Lob
	private String color;

	@ElementCollection
	@JoinTable(name="User_Address")  //this annotation is just used to name the table otherwise default name is Alien_listofAddresses ie classname_collectionName
	@GenericGenerator(name ="my-generator", strategy = "increment") 
	@CollectionId(columns = { @Column(name="address_id") }, generator = "my-generator", type = @Type(type = "long"))  //for generating primary key in Collections table
	private Collection<Address> listofAddress = new ArrayList();

	

	public Collection<Address> getListofAddress() {
		return listofAddress;
	}

	public void setListofAddress(Collection<Address> listofAddress) {
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
