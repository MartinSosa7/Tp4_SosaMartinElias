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

import ar.edu.unju.fi.collections.AlumnoCollection;
import ar.edu.unju.fi.model.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	Alumno nuevoAlumno;
	
	@GetMapping("/formularioAlumno")
	public ModelAndView getFormulario(){
		nuevoAlumno = new Alumno();
		ModelAndView mav = new ModelAndView("/forms/alumnoForm");
		mav.addObject("alumno", nuevoAlumno);
		mav.addObject("method", "POST");
		return mav;
	}
	
	@GetMapping("/listado")
	public ModelAndView getListadoAlumnos() {
		ModelAndView mav = new ModelAndView("/listados/listadoAlumnos");
		mav.addObject("listadoArray", AlumnoCollection.getAll());
		return mav;
	}
	
	@GetMapping("/listado/{lu}")
	public ModelAndView getAlumnoByLU(@PathVariable("lu") String lu) {
		ModelAndView mav = new ModelAndView("listadoAlumnos");
		mav.addObject("listadoArray", Arrays.asList(AlumnoCollection.getAlumnoByLU(lu)));
		return mav;
	}
	
	@PostMapping("/guardar")
	public ModelAndView createAlumno(@ModelAttribute("alumno") Alumno alumno) {
		if(AlumnoCollection.getAlumnoByLU(alumno.getLu())!= null) {
			AlumnoCollection.modifyAlumno(alumno);
		}
		else {
			AlumnoCollection.addAlumno(alumno);
		}
		
		
		return getListadoAlumnos();
	}
	
	@GetMapping("/modificar/{lu}")
	public ModelAndView modifyAlumno(@PathVariable("lu") String lu) {
		ModelAndView mav = getFormulario();
		mav.addObject("alumno", AlumnoCollection.getAlumnoByLU(lu));
		mav.addObject("method", "PUT");
		return mav;
	}
	
	@GetMapping("/eliminar/{lu}")
	public ModelAndView deleteAlumno(@PathVariable("lu") String lu) {
		AlumnoCollection.deleteAlumnoByLU(lu);
		return getListadoAlumnos();
	}
	
	
}
