package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class DocenteCollection {

	static List<Docente> listadoDocentes = new ArrayList<>();
	
	static {
		listadoDocentes.add(new Docente("FI0001","PEPE","PEREZ","pepe@gmail.com",3881234));
	}
	
	public static void addDocente(Docente docente) {
		listadoDocentes.add(docente);
	}
	
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
		for (int i = 0; i < listadoDocentes.size(); i++) {
			if(listadoDocentes.get(i).getLegajo().equals(docenteModificado.getLegajo())) {
				listadoDocentes.set(i, docenteModificado);
				break;
			}
		}
	}
	
	public static void deleteDocenteByLegajo(String legajo) {
		listadoDocentes.removeIf(docente -> docente.getLegajo().equals(legajo));
	}
	
}
