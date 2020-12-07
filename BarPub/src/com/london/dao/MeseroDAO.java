package com.london.dao;


import com.london.entity.Mesero;
import com.london.util.Conexion;
public class MeseroDAO extends Conexion<Mesero> implements GenericDao1<Mesero> {

	public MeseroDAO() {
		super(Mesero.class);
	}

}
