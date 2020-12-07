package com.london.dao;

import com.london.entity.Venta;
import com.london.util.Conexion;

public class VentaDAO extends Conexion<Venta> implements GenericDao1<Venta>{

	public VentaDAO() {
		super(Venta.class);
	}

}
