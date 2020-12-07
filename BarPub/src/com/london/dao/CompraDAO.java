package com.london.dao;


import com.london.entity.Compra;
import com.london.util.Conexion;

public class CompraDAO extends Conexion<Compra> implements GenericDao1<Compra> {

	public CompraDAO() {
		super(Compra.class);
	}

}
