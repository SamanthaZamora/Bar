package com.london.util;


import com.london.dao.ClienteDAO;
import com.london.entity.Administrador;
import com.london.entity.Cliente;

public class Prueba {

	public static void  main(String[] args) {
		
		/***************** CLIENTE *******************/
		ClienteDAO c= new ClienteDAO();
		
		Cliente c1= new Cliente();
		
		c1.setApellido("daza");
		c1.setCedula("1478526985");
		c1.setClave("dolor");
		c1.setDireccion("Cll 23 jdeoj");
		c1.setEmail("angiedaza@gmail.com");
		c1.setNombre("angie");
		c1.setTelefono("24785696");
		
		
		c.insert(c1);
		
	}

}
