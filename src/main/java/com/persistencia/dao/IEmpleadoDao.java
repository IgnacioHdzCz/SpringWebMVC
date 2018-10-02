package com.persistencia.dao;

import java.util.List;

import com.persistencia.modelo.Empleado;

public interface IEmpleadoDao {
	// Agregamos los siguientes metodos
	public void agregar(Empleado empleado);
	public List<Empleado> buscaTodos();
	public void borrar(Empleado empleado);
	public Empleado actualizar(Empleado empleado);
	public Empleado buscarPorId(int id);

}
