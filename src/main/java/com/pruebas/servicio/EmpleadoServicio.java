package com.pruebas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistencia.dao.IEmpleadoDao;
import com.persistencia.modelo.Empleado;

@Service
@Transactional
public class EmpleadoServicio implements IEmpleadoServicio {
	
	@Autowired
	IEmpleadoDao empleadoDao;

	@Override
	public void agregar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoDao.agregar(empleado);

	}

	@Override
	public void borrar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoDao.borrar(empleado);

	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		return empleadoDao.buscaTodos();
	}

	@Override
	public Empleado actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.actualizar(empleado);
	}

	@Override
	public Empleado buscarPorId(int id) {
		// TODO Auto-generated method stub
		return empleadoDao.buscarPorId(id);
	}

}
