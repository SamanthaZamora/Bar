package com.london.dao;


import com.london.entity.Gasto;
import com.london.util.Conexion;

public class GastoDAO extends Conexion<Gasto> implements GenericDao1<Gasto>{

	public GastoDAO() {
		super(Gasto.class);
	}

}
