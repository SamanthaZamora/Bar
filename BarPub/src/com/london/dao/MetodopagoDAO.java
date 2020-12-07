package com.london.dao;


import com.london.entity.Metodopago;
import com.london.util.Conexion;

public class MetodopagoDAO extends Conexion<Metodopago> implements GenericDao1<Metodopago>{

	public MetodopagoDAO() {
		super(Metodopago.class);
	}

}
