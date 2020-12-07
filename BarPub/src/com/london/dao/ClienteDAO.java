package com.london.dao;


import com.london.entity.Cliente;
import com.london.util.Conexion;

public class ClienteDAO extends Conexion<Cliente> implements GenericDao1<Cliente>{

	public ClienteDAO() {
		super(Cliente.class);
	}

}
