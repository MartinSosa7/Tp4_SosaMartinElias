package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Materia;

public class MateriaCollection {

	static List<Materia> listadoMaterias = new ArrayList<>();
	
	public static List<Materia> getAll(){
		return listadoMaterias;
	}
	
	public static Materia findMateriaByName(String name) {
		for (Materia materia : listadoMaterias) {
			if(materia.getName().equals(name))
				return materia;
		}
		return null;
	}
	
	public static void modifyMateria(Materia materiaMoficada) {
		
		for (Materia materia : listadoMaterias) {
			if(materia.getCode().equals(materiaMoficada.getCode())) {
				materia = materiaMoficada;
			}
		}
		
	}
	
	public static void deleteMateriaByCode(String code) {
		listadoMaterias.removeIf(materia -> materia.getCode().equals(code));
	}

}
