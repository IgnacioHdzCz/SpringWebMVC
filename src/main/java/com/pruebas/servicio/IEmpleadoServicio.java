package com.pruebas.servicio;

import java.util.List;

import com.persistencia.modelo.Empleado;

public interface IEmpleadoServicio {
	
	public void agregar(Empleado empleado);
	public void borrar(Empleado empleado);
	public  List<Empleado> buscarTodos();
	public Empleado actualizar(Empleado empleado);
	public Empleado buscarPorId (int id);


}
