package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {

	private Integer dni;
	private String name;
	private String surName;
	private String emai;
	private Integer phoneNumber;
	private LocalDate birthday;
	private String address;
	private String lu;
	
	public Alumno() {}

	public Alumno(Integer dni, String name, String surName, String emai, Integer phoneNumber, LocalDate birthday,
			String address, String lu) {
		super();
		this.dni = dni;
		this.name = name;
		this.surName = surName;
		this.emai = emai;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.address = address;
		this.lu = lu;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
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

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLu() {
		return lu;
	}

	public void setLu(String lu) {
		this.lu = lu;
	}
	
	
	
}
