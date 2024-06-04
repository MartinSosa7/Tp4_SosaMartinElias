package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Carrera;

public class CarreraCollection {

	static List<Carrera> listadoCarrera = new ArrayList<>();
	
	public static List<Carrera> getAll(){
		return listadoCarrera;
	}
	
	public static Carrera getCarreraByCode(String code) {
		for (Carrera carrera : listadoCarrera) {
			if(carrera.getCode().equals(code))
				return carrera;
		}
		return null;
	}
	
	public static void modifyCarrera(Carrera carreraModificada) {
		for (Carrera carrera : listadoCarrera) {
			if(carrera.getCode().equals(carreraModificada.getCode()))
				carrera = carreraModificada;
		}
	}
	
	public static void deleteCarreraByCode(String code) {
		listadoCarrera.removeIf(carrera -> carrera.getCode().equals(code));
	}
}
