package com.london.util;


import java.util.Date;

import com.london.dao.ClienteDAO;
import com.london.dao.EmpleadoDAO;
import com.london.entity.Cliente;
import com.london.entity.Empleado;

public class Prueba {

	public static void  main(String[] args) {
		
		/***************** CLIENTE *******************/
		ClienteDAO c= new ClienteDAO();
		
		Cliente c1= new Cliente();
		
		c1.setApellido("daza");
		c1.setCedula("1478526985");
		c1.setClave("0102");
		c1.setDireccion("Cll 23 jdeoj");
		c1.setEmail("angiedaza@gmail.com");
		c1.setNombre("angie lorena ");
		c1.setTelefono("24785696");
		
		
		/*c.insert(c1);*/
		
		c.update(c1);
		
		
		/***************** CLIENTE *******************/
		/*EmpleadoDAO e= new EmpleadoDAO();
		
		Empleado e1= new Empleado();
		
		e1.setNombre("Paola Andrea");
		e1.setTelefono("3124568574");
		e1.setApellido("Ricaute");
		e1.setCargo("Mesera");
		e1.setCedula("2365897412");
		e1.setEmail("ricauteAndre@gmail.com");
		e1.setDireccion("Cll 2#1A Torredon");
		
		/*Date fechanac= new Date();
		String f= "2000-09-12";
		SimpleDateFormat sfd=new SimpleDateFormat(f);
		
		e1.setFechaNacimiento(sfd);
		
		
		/*Date fechaing= new Date();
		String f2= "2019-09-01";
		SimpleDateFormat sfd2=new SimpleDateFormat(f2);
		
		e1.setFechaNacimiento(sfd2);
		
		
		/*Date fechairet= new Date();
		String f3= "2020-09-12";
		SimpleDateFormat sfd3=new SimpleDateFormat(f3);
		
		e1.setFechaNacimiento(sfd3);*/
		
		/*Date fechanac= new Date("2000-09-12");
		e1.setFechaNacimiento(fechanac);
		
		Date fechaing= new Date("2019-09-01");
		e1.setFechaNacimiento(fechaing);
		
		Date fechairet= new Date("2020-09-12");
		e1.setFechaNacimiento(fechairet);
		
		e.insert(e1);*/
		
		
	}

}
