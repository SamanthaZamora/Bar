package com.london.dao;

import com.london.entity.Producto;
import com.london.util.Conexion;

public class ProductoDAO extends Conexion<Producto> implements GenericDao1<Producto>{

	public ProductoDAO()  {
		super(Producto.class);
	}

}
