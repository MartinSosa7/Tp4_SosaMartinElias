package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class DocenteCollection {

	static List<Docente> listadoDocentes = new ArrayList<>();
	
	public static List<Docente> getAll(){
		return listadoDocentes;
	}
	
	public static Docente getDocenteByLegajo(String legajo) {
		for (Docente docente : listadoDocentes) {
			if (docente.getLegajo().equals(legajo)) {
				return docente;
			}
		}
		return null;
	}
	
	public static void modifyDocente(Docente docenteModificado) {
		for (Docente docente : listadoDocentes) {
			if(docente.getLegajo().equals(docenteModificado.getLegajo()))
				docente = docenteModificado;
		}
	}
	
	public static void deleteDocenteByLegajo(String legajo) {
		listadoDocentes.removeIf(docente -> docente.getLegajo().equals(legajo));
	}
	
}
