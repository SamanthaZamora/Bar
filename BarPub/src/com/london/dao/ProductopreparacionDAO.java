package com.london.dao;

import com.london.entity.Productopreparacion;
import com.london.util.Conexion;

public class ProductopreparacionDAO extends Conexion<Productopreparacion> implements GenericDao1<Productopreparacion>{

	public ProductopreparacionDAO() {
		super(Productopreparacion.class);
	}

}