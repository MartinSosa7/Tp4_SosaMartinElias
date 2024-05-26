package ar.edu.unju.fi.model;

public class Carrera {

	private String code;
	private String name;
	private Integer ageAmount;
	private String status;
	
	public Carrera() {}

	public Carrera(String code, String name, Integer ageAmount, String status) {
		super();
		this.code = code;
		this.name = name;
		this.ageAmount = ageAmount;
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAgeAmount() {
		return ageAmount;
	}

	public void setAgeAmount(Integer ageAmount) {
		this.ageAmount = ageAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
