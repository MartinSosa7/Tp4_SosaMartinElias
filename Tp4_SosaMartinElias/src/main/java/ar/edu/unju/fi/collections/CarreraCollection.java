package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Carrera;

public class CarreraCollection {

	static List<Carrera> listadoCarrera = new ArrayList<>();
	
	static {
		listadoCarrera.add(new Carrera("UNJU001","APU",16,"ACTIVA"));
		listadoCarrera.add(new Carrera("UNJU002","INGENIERA INFO",20,"ACTIVA"));
	}
	
	public static void addCarrera(Carrera carrera) {
		listadoCarrera.add(carrera);
	}
	
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
		for (int i = 0; i < listadoCarrera.size(); i++) {
			if(carreraModificada.getCode().equals(listadoCarrera.get(i).getCode())) {
				listadoCarrera.set(i, carreraModificada);
				break;
			}
		}
	}
	
	public static void deleteCarreraByCode(String code) {
		listadoCarrera.removeIf(carrera -> carrera.getCode().equals(code));
	}
}
