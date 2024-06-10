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
import ar.edu.unju.fi.collections.DocenteCollection;
import ar.edu.unju.fi.collections.MateriaCollection;
import ar.edu.unju.fi.model.Materia;

@Controller
@RequestMapping("/materia")
public class MateriaController {

	@Autowired
	Materia materia;
	
	@GetMapping("/formularioMateria")
	public ModelAndView getFormularioMaterias() {
		ModelAndView mav = new ModelAndView("/forms/materiaForm");
		mav.addObject("method", "POST");
		mav.addObject("materia", materia);
		mav.addObject("docentesArray", DocenteCollection.getAll());
		mav.addObject("carrerasArray", CarreraCollection.getAll());
		return mav;
	}
	
	@GetMapping("/listado")
	public ModelAndView getListadoMaterias() {
		ModelAndView mav = new ModelAndView("/listados/listadoMaterias");
		mav.addObject("listadoArray", MateriaCollection.getAll());
		return mav;
	}
	
	@GetMapping("/listado/{code}")
	public ModelAndView getMateriaByName(@PathVariable("code")String code) {
		ModelAndView mav = new ModelAndView("/listados/listadoMaterias");
		mav.addObject("listadoArray", Arrays.asList(MateriaCollection.findMateriaByCode(code)));
		return mav;
	}
	
	@PostMapping("/guardar")
	public ModelAndView createMateria(@ModelAttribute Materia materia) {
		materia.setCourse(CarreraCollection.getCarreraByCode(materia.getCourse().getCode()));
		materia.setDocente(DocenteCollection.getDocenteByLegajo(materia.getDocente().getLegajo()));
		if(MateriaCollection.findMateriaByCode(materia.getCode()) != null)  {
			MateriaCollection.modifyMateria(materia);
		}else {
			MateriaCollection.addMateria(materia);
		}
		
		return getListadoMaterias();
	}
	
	@GetMapping("/modificar/{code}")
	public ModelAndView modifyMateria(@PathVariable("code") String code) {
		ModelAndView mav = getFormularioMaterias();
		mav.addObject("method", "PUT");
		mav.addObject("materia", MateriaCollection.findMateriaByCode(code));
		return mav;
	}
	
	@GetMapping("/eliminar/{code}")
	public ModelAndView deleteMateria(@PathVariable("code") String code) {
		MateriaCollection.deleteMateriaByCode(code);
		return getListadoMaterias();
	}
	
}
