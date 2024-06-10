package ar.edu.unju.fi.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class AlumnoCollection {

	static List<Alumno> listadoAlumnos = new ArrayList<>();
	static {
		listadoAlumnos.add(new Alumno(1234, "Martin", "Sosa", "martin@gmail.com", 3881234, LocalDate.of(2001, 7, 2), "Street", "APU4625"));
	}
	
	public static void addAlumno(Alumno alumno) {
		listadoAlumnos.add(alumno);
	}
	
	public static List<Alumno> getAll(){
		return listadoAlumnos;
	}
	
	public static Alumno getAlumnoByLU(String lu) {
		for (Alumno alumno : listadoAlumnos) {
			if(alumno.getLu().equals(lu))
				return alumno;
		}
		return null;
	}
	
	public static void modifyAlumno(Alumno alumnoModificado) {
	    for (int i = 0; i < listadoAlumnos.size(); i++) {
	        if (listadoAlumnos.get(i).getLu().equals(alumnoModificado.getLu())) {
	            listadoAlumnos.set(i, alumnoModificado);
	            break;
	        }
	    }
	}

	
	public static void deleteAlumnoByLU(String lu) {
		listadoAlumnos.removeIf(alumno -> alumno.getLu().equals(lu));
	}
}
