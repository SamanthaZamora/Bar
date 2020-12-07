package com.london.dao;

import com.london.entity.Productocompra;
import com.london.util.Conexion;

public class ProductocompraDAO extends Conexion<Productocompra> implements GenericDao1<Productocompra>{

	public ProductocompraDAO() {
		super(Productocompra.class);
	}

}