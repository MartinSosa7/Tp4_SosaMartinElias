package ar.edu.unju.fi.model;

public class Docente {

	private String legajo;
	private String name;
	private String surName;
	private String emai;
	private Integer phoneNumber;
	
	public Docente() {}

	public Docente(String legajo, String name, String surName, String emai, Integer phoneNumber) {
		super();
		this.legajo = legajo;
		this.name = name;
		this.surName = surName;
		this.emai = emai;
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

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
}
