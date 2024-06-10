package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Docente {

	private String legajo;
	private String name;
	private String surName;
	private String email;
	private Integer phoneNumber;
	
	public Docente() {}

	public Docente(String legajo, String name, String surName, String email, Integer phoneNumber) {
		super();
		this.legajo = legajo;
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emai) {
		this.email = emai;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
}
