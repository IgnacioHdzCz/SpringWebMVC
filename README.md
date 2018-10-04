
                               
                                 
                    
                   
 # Aplicacion WEB -> CREATE-READ-UPDATE-DELETE (CRUD)
 ##                                              Spring Web Mvc + Maven + Tomcat + MySQL
 Para este proyecto se utilizo el IDE Spring Tool Suite, asi que vamos a la pestaña File -> New -> Maven Project y creamos un nuevo proyecto web en maven.
![spring2](https://user-images.githubusercontent.com/41167366/46326840-ab62d900-c5b3-11e8-9557-c609cea20691.png)
Selecionamos un archetype que se encuentra en el repositorio de Maven.

![spring3](https://user-images.githubusercontent.com/41167366/46352730-53f25680-c60f-11e8-862c-1060cb88fd56.png)

 Una vez creado convertimos ese proyecto a Spring.

![spring4](https://user-images.githubusercontent.com/41167366/46353007-fdd1e300-c60f-11e8-9e53-852a7bec0c85.png)

 Ya tenemos el proyecyo en Spring, pero yo agregare las dependencias al archivo POM, las dependencias las podemos encontrar en la siguiente dirección: https://mvnrepository.com/, el archivo queda de la siguiente manera.

![spring5](https://user-images.githubusercontent.com/41167366/46353287-a122f800-c610-11e8-9b4b-f61c4e5cc860.png)
![spring6](https://user-images.githubusercontent.com/41167366/46356613-f282b580-c617-11e8-9db3-1e04707be498.png)
![spring7](https://user-images.githubusercontent.com/41167366/46356614-f282b580-c617-11e8-8ec0-4b76113e69ad.png)
![spring8](https://user-images.githubusercontent.com/41167366/46356732-2c53bc00-c618-11e8-94e5-84e6c736a396.png)


 Creamos la siguiente carpeta con el nombre recursos en el directorio  que se muestra en la imagen y añadimos el siguiente archivo con nombre aplicacion y extension properties que contendra la información para conectarnos a la base de datos.
El archivo debe quedar con la siguiente información.
![spring14](https://user-images.githubusercontent.com/41167366/46358287-8f931d80-c61b-11e8-9238-15a4daa7a5e4.png)
![spring15](https://user-images.githubusercontent.com/41167366/46358562-17792780-c61c-11e8-8420-2776cfb10a5b.png)


Necesitamos crear un archivo xml que se llama spring-servlet, nos posicionamos en el proyecto click izquierdo New -> Other y seleccionamos Spring Bean Configuration File

![spring31](https://user-images.githubusercontent.com/41167366/46450683-7091aa00-c747-11e8-8377-b902448c314f.png)
![spring32](https://user-images.githubusercontent.com/41167366/46450684-7091aa00-c747-11e8-913f-e16f1b4d261a.png)
![spring33](https://user-images.githubusercontent.com/41167366/46450685-7091aa00-c747-11e8-8bee-714599c9d06b.png)
![spring34](https://user-images.githubusercontent.com/41167366/46450686-7091aa00-c747-11e8-82f3-367d331777a4.png)

Creamos la siguiente carpeta con la siguiente dirección -> src/main/java
![spring16](https://user-images.githubusercontent.com/41167366/46449754-9b2d3400-c742-11e8-8882-9a5e11d72227.png)
![spring17](https://user-images.githubusercontent.com/41167366/46449852-10006e00-c743-11e8-8441-d18ecb1d83dd.png)

Creamos dentro de esa dirección nuestro package y creamos nuestra primera clase de Java con el nombre Empleado
![spring18](https://user-images.githubusercontent.com/41167366/46449908-50f88280-c743-11e8-9a4c-cebc200a9c34.png)
![spring19](https://user-images.githubusercontent.com/41167366/46449980-b3ea1980-c743-11e8-92bd-9eb85a57d9a4.png)
![spring20](https://user-images.githubusercontent.com/41167366/46449978-b3ea1980-c743-11e8-9926-537cefeeb44a.png)
![spring21](https://user-images.githubusercontent.com/41167366/46449979-b3ea1980-c743-11e8-9662-8f39a1cc6608.png)

La clase Empleado se encuentra en el package com.persistencia.modelo, debe contener los siguientes atributos y con la ayuda del IDE generamos los Getters y Setters

package com.persistencia.modelo

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Empleado implements Serializable {

	private static final long serialVersionUID = 270660453805162818L;
	private int id;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String tel;
	private String direccion;
	
	
  //Agregamos la anotacion @Id y @GeneratedValue(strategy=GenerationType.Auto)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}

Ahora creamos otro package com.persistencia.dao y generamos la Interface IEmpleadoDao y creamos la clase EmpleadoDao que implementa esa
Interface.

![spring25](https://user-images.githubusercontent.com/41167366/46450379-ca917000-c745-11e8-8d76-686d0c613c85.png)
![spring26](https://user-images.githubusercontent.com/41167366/46450376-ca917000-c745-11e8-9f3b-b22825833130.png)
![spring27](https://user-images.githubusercontent.com/41167366/46450377-ca917000-c745-11e8-846e-54efb9f831a1.png)

La Interface queda con el siguiente código

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

Y la clase que implementa esa Interface.


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


Creamos la interface IServicioEmpleado y su respectiva clase que lo implemente en el package com.pruebas.servicio

![spring38](https://user-images.githubusercontent.com/41167366/46450881-6fad4800-c748-11e8-9621-ab7f20811384.png)
![spring40](https://user-images.githubusercontent.com/41167366/46450880-6f14b180-c748-11e8-9dab-42faf8133ae7.png)
![spring39](https://user-images.githubusercontent.com/41167366/46450879-6f14b180-c748-11e8-8628-daf1ab3a11df.png)

De igual forma creamos un package con el siguiente nombre com.persistencia.control y dentro la clase EmpleadoControl. 

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

Como sabemos el proyecto sigue el patron  Modelo-Vista-Controlador, asi que necesitamos crear las vistas que tendra nuestro usuario.
Para ello seguimos los siguientes pasos.
Creamos una carpeta con el nombre de vistas en la carpeta WEB-INF y añadimos el archivo JSP home y EmpleadoForm

![spring41](https://user-images.githubusercontent.com/41167366/46451212-e72fa700-c749-11e8-8098-bffc5f502f0b.png)
![spring42](https://user-images.githubusercontent.com/41167366/46451213-e7c83d80-c749-11e8-9168-9df53894ca50.png)
![spring44](https://user-images.githubusercontent.com/41167366/46451254-1fcf8080-c74a-11e8-9afb-33d5eaaeb543.png)

La estructura del proyecto debe quedar de la siguiente manera


