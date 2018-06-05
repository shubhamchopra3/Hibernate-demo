package com.hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity(name = "ALIEN_DETAILS")
@Cacheable
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY)
public class Alien {

	@Id
	@GeneratedValue // for autogeneration it is surrogate key
	private int id;
	@Column(name = "name_alien")
	private String name;
	@Lob
	private String color;
	

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

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}

}
