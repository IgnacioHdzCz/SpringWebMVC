package com.persistencia.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.persistencia.modelo.Empleado;
import com.pruebas.servicio.IEmpleadoServicio;



@Controller
public class EmpleadoControl {
	
	@Autowired
	IEmpleadoServicio empleadoServicio;
	
	@RequestMapping(value = "/")
	public ModelAndView listaEmpleado(ModelAndView model) throws IOException{
		List<Empleado> listaEmpleado = empleadoServicio.buscarTodos();
		model.addObject("listaEmpleado",listaEmpleado);
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value="/agregar", method=RequestMethod.GET)
	public ModelAndView agregar(ModelAndView model) {
		Empleado empleado = new Empleado();
		model.addObject("empleado", empleado);
		model.setViewName("EmpleadoForm");
		return model;
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public ModelAndView salvar(@ModelAttribute Empleado empleado){
		empleadoServicio.agregar(empleado);
		return new ModelAndView("redirect:/");
		
	}
	
	@RequestMapping(value="/borrar", method= RequestMethod.GET)
	public ModelAndView borrar(HttpServletRequest request) {
		int empleadoId = Integer.parseInt(request.getParameter("id"));
		Empleado empleado = empleadoServicio.buscarPorId(empleadoId);
		empleadoServicio.borrar(empleado);
		return new ModelAndView("redirect:/");
		
	}
	
	@RequestMapping(value="/actualizar",method=RequestMethod.GET)
	public ModelAndView actualizar(HttpServletRequest request) {
		int empleadoId = Integer.parseInt(request.getParameter("id"));
		Empleado empleado = empleadoServicio.buscarPorId(empleadoId);
		
		
		ModelAndView model = new ModelAndView("EmpleadoForm");	
		model.addObject("empleado",empleado);
		return model;
		
	}

}
