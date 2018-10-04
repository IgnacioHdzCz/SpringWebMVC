
                               
                                 
                    
                   
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

Creamos la siguiente carpeta con la siguiente dirección -> src/main/java
![spring16](https://user-images.githubusercontent.com/41167366/46449754-9b2d3400-c742-11e8-8882-9a5e11d72227.png)
![spring17](https://user-images.githubusercontent.com/41167366/46449852-10006e00-c743-11e8-8441-d18ecb1d83dd.png)

Creamos dentro de esa dirección nuestro package y creamos nuestra primera clase de Java con el nombre Empleado
![spring18](https://user-images.githubusercontent.com/41167366/46449908-50f88280-c743-11e8-9a4c-cebc200a9c34.png)
![spring19](https://user-images.githubusercontent.com/41167366/46449980-b3ea1980-c743-11e8-92bd-9eb85a57d9a4.png)
![spring20](https://user-images.githubusercontent.com/41167366/46449978-b3ea1980-c743-11e8-9926-537cefeeb44a.png)
![spring21](https://user-images.githubusercontent.com/41167366/46449979-b3ea1980-c743-11e8-9662-8f39a1cc6608.png)

La clase Empleado debe contener los siguientes atributos y con la ayuda del IDE generamos los Getters y Setters
package com.persistencia.modelo;

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





