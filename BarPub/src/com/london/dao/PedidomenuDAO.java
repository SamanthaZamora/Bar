package com.london.dao;

import com.london.entity.Pedidomenu;
import com.london.util.Conexion;

public class PedidomenuDAO extends Conexion<Pedidomenu> implements GenericDao1<Pedidomenu>{

	public PedidomenuDAO() {
		super(Pedidomenu.class);
	}

}
