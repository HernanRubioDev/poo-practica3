package com.unnoba.practica3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practica3Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica3Application.class, args);
	}

}

/*
¿Cual es el propósito de la clase generada por el asistente que tiene la notacion @SpringBootApplication?

		La clase generada por el asistente que tiene la anotación @SpringBootApplication es el punto de entrada de tu aplicación Spring Boot. 
		Esta clase es la responsable de iniciar la aplicación y configurar los componentes necesarios para su funcionamiento.
		La anotación @SpringBootApplication combina las anotaciones @Configuration, @EnableAutoConfiguration y @ComponentScan. 
		La anotación @Configuration indica que la clase es un punto de entrada para la configuración de Spring. 
		La anotación @EnableAutoConfiguration indica que Spring debe automatizar la configuración de los componentes necesarios para la aplicación. 
		La anotación @ComponentScan indica que Spring debe escanear el paquete de la clase para encontrar los componentes que deben registrarse en el contenedor de Spring.

¿Para qué se utiliza el archivo src/main/resources/application.properties?
		se utiliza para configurar la aplicación Spring Boot. 
		Este archivo contiene pares de clave-valor que se utilizan para configurar diferentes aspectos de la aplicación, como la base de datos, el servidor web y la seguridad.

 Ejecute el proyecto y determine cuál es la causa por la cual falla el deploy.
		La causa del fallo, es que le especificamos a SpringBoot, que la aplicación se conectaria con una base de datos. Pero la base de datos aun no existe ni se especificó
		la configuración de conexión a la misma.

Busque qué configuración debe agregar para poder resolver el inconveniente.
		Para resolver este invonveniente, debemos crear una base de datos y especificar la configuración en el archivo application.properties
		En mi caso, la base de datos creada es poo_practica3
		En el archivo application.properties estan las configuraciones correspondientes para que la aplicacion se ejecute correctamente.
*/