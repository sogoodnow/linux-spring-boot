package com.msp.user;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class EntityUser {

	public EntityUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String username;//longin name
	private Long id;
	private int age;
	private BigDecimal blance;
	private String name;//name

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getBlance() {
		return blance;
	}
	public void setBlance(BigDecimal blance) {
		this.blance = blance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
