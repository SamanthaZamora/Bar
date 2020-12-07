package com.london.dao;

import com.london.entity.Productocompraventa;
import com.london.util.Conexion;

public class ProductocompraventaDAO extends Conexion<Productocompraventa> implements GenericDao1<Productocompraventa>{

	public ProductocompraventaDAO() {
		super(Productocompraventa.class);
	}

}
