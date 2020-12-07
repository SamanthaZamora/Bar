package com.london.dao;

import com.london.entity.Cocinero;
import com.london.util.Conexion;
public class CocineroDAO  extends Conexion<Cocinero> implements GenericDao1<Cocinero>{

	public CocineroDAO() {
		super(Cocinero.class);
	}

}
