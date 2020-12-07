package com.london.dao;

import com.london.entity.Preparacion;
import com.london.util.Conexion;

public class PreparacionDAO extends Conexion<Preparacion> implements GenericDao1<Preparacion>{

	public PreparacionDAO() {
		super(Preparacion.class);
	}

}
