package ar.edu.unju.fi.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.CarreraCollection;
import ar.edu.unju.fi.model.Carrera;

@Controller
@RequestMapping("/carrera")
public class CarreraController {

	@Autowired
	Carrera nuevaCarrera;
	
	@GetMapping("/formularioCarrera")
	public ModelAndView getFormularioCarreras() {
		ModelAndView mav = new ModelAndView("/forms/carreraForm");
		mav.addObject("carrera", nuevaCarrera);
		mav.addObject("method", "POST");
		return mav;
	}
	
	
	@GetMapping("/listado")
	public ModelAndView getListadoCarreras() {
		ModelAndView mav = new ModelAndView("/listados/listadoCarreras");
		mav.addObject("listadoArray", CarreraCollection.getAll());
		return mav;
	}
	
	@GetMapping("/listado/{code}")
	public ModelAndView getCarrera(@PathVariable("code") String code) {
		ModelAndView mav = new ModelAndView("/listados/listadoCarreras");
		mav.addObject("listadoArray", Arrays.asList(CarreraCollection.getCarreraByCode(code)));
		return mav;
	}
	
	@PostMapping("/guardar")
	public ModelAndView createCarrera(@ModelAttribute Carrera carrera) {
		if(CarreraCollection.getCarreraByCode(carrera.getCode())!=null) {
			CarreraCollection.modifyCarrera(carrera);
		}
		else {
			CarreraCollection.addCarrera(carrera);
		}
		
		return getListadoCarreras();
	}
	
	@GetMapping("/modificar/{code}")
	public ModelAndView modifyCarrera(@PathVariable("code") String code) {
		ModelAndView mav = getFormularioCarreras();
		mav.addObject("carrera", CarreraCollection.getCarreraByCode(code));
		mav.addObject("method", "PUT");
		return mav;
	}
	
	@GetMapping("/eliminar/{code}")
	public ModelAndView deleteCarrera(@PathVariable("code") String code) {
		CarreraCollection.deleteCarreraByCode(code);
		return getListadoCarreras();
	}
	
}
