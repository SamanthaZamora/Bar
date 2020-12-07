package com.london.dao;

import com.london.entity.Proveedor;
import com.london.util.Conexion;

public class ProveedorDAO extends Conexion< Proveedor> implements GenericDao1< Proveedor>{

	public ProveedorDAO() {
		super(Proveedor.class);
	}

}
