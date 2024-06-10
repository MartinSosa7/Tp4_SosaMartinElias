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

import ar.edu.unju.fi.collections.DocenteCollection;
import ar.edu.unju.fi.model.Docente;

@Controller
@RequestMapping("/docente")
public class DocenteController {

	@Autowired
	Docente docente;
	
	@GetMapping("/formularioDocente")
	public ModelAndView getFormularioDocente() {
		ModelAndView mav = new ModelAndView("/forms/docenteForm");
		mav.addObject("method", "POST");
		mav.addObject("docente", docente);
		return mav;
	}
	
	@GetMapping("/listado")
	public ModelAndView getListadoDocentes() {
		ModelAndView mav = new ModelAndView("/listados/listadoDocentes");
		mav.addObject("listadoArray", DocenteCollection.getAll());
		return mav;
	}
	
	@GetMapping("/listado/{legajo}")
	public ModelAndView getDocenteBylegajo(@PathVariable("legajo") String legajo) {
		ModelAndView mav = new ModelAndView("/listados/listadoDocentes");
		mav.addObject("listadoArray", Arrays.asList(DocenteCollection.getDocenteByLegajo(legajo)));
		return mav;
	}
	
	@PostMapping("/guardar")
	public ModelAndView createDocente(@ModelAttribute Docente docente) {
		if(DocenteCollection.getDocenteByLegajo(docente.getLegajo()) != null) {
			DocenteCollection.modifyDocente(docente);	
		}else {
			DocenteCollection.addDocente(docente);
		}
		return getListadoDocentes();
	}
	
	@GetMapping("/modificar/{legajo}")
	public ModelAndView modifyDocente(@PathVariable String legajo) {
		ModelAndView mav = getFormularioDocente();
		mav.addObject("docente", DocenteCollection.getDocenteByLegajo(legajo));
		mav.addObject("method", "PUT");
		return mav;
	}
	
	@GetMapping("/eliminar/{legajo}")
	public ModelAndView deleteDocente(@PathVariable("legajo") String legajo) {
		DocenteCollection.deleteDocenteByLegajo(legajo);
		return getListadoDocentes();
	}
}
