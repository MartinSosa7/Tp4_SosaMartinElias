package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Materia;

public class MateriaCollection {

	static List<Materia> listadoMaterias = new ArrayList<>();
	
	public static void addMateria(Materia materia) {
		listadoMaterias.add(materia);
	}
	
	public static List<Materia> getAll(){
		return listadoMaterias;
	}
	
	public static Materia findMateriaByCode(String code) {
		for (Materia materia : listadoMaterias) {
			if(materia.getCode().equals(code));
				return materia;
		}
		return null;
	}
	
	public static void modifyMateria(Materia materiaMoficada) {
		for (int i = 0; i < listadoMaterias.size(); i++) {
			if (listadoMaterias.get(i).getCode().equals(materiaMoficada.getCode())) {
				listadoMaterias.set(i, materiaMoficada);
				break;
			}
			
		}
	}
	
	public static void deleteMateriaByCode(String code) {
		listadoMaterias.removeIf(materia -> materia.getCode().equals(code));
	}

}
