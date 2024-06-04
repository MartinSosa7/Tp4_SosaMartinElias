package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class AlumnoCollection {

	static List<Alumno> listadoAlumnos = new ArrayList<>();
	
	public static List<Alumno> getAll(){
		return listadoAlumnos;
	}
	
	public static Alumno getAlumnoByDni(Integer dni) {
		for (Alumno alumno : listadoAlumnos) {
			if(alumno.getDni() == dni)
				return alumno;
		}
		return null;
	}
	
	public static void modifyAlumno(Alumno alumnoModificado) {
		for (Alumno alumno : listadoAlumnos) {
			if(alumno.getDni() == alumnoModificado.getDni())
				alumno = alumnoModificado;
		}
	}
	
	public static void deleteAlumnoByDni(Integer dni) {
		listadoAlumnos.removeIf(alumno -> alumno.getDni() == dni);
	}
}
