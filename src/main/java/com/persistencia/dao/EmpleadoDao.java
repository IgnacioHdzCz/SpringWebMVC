package com.persistencia.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistencia.modelo.Empleado;

@Repository
public class EmpleadoDao implements IEmpleadoDao {

	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void agregar(Empleado empleado) {

		sessionFactory.getCurrentSession().save(empleado);

	}
	
	//modificado

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> buscaTodos() {

		return sessionFactory.getCurrentSession().createQuery("from Empleado").list();
	}

	@Override
	public void borrar(Empleado empleado) {
		sessionFactory.getCurrentSession().delete(empleado);

	}

	@Override
	public Empleado actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(empleado);
		return empleado;
	}

	@Override
	public Empleado buscarPorId(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Empleado.class, id);
	}

}
