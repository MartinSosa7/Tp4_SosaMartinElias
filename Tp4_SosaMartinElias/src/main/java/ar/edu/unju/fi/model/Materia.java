package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Materia {

	private String code;
	private String name;
	private String curso;
	private Integer hoursAmount;
	private String modality;
	private Docente docente;
	private Carrera course;
	
	public Materia() {}

	public Materia(String code, String name, String curso, Integer hoursAmount, String modality, Docente docente,
			Carrera course) {
		super();
		this.code = code;
		this.name = name;
		this.curso = curso;
		this.hoursAmount = hoursAmount;
		this.modality = modality;
		this.docente = docente;
		this.course = course;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getHoursAmount() {
		return hoursAmount;
	}

	public void setHoursAmount(Integer hoursAmount) {
		this.hoursAmount = hoursAmount;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCourse() {
		return course;
	}

	public void setCourse(Carrera course) {
		this.course = course;
	}
	
	
	
	
	
}
