package com.london.dao;

import com.london.entity.Bartender;
import com.london.util.Conexion;

public class BartenderDAO  extends Conexion<Bartender> implements GenericDao1<Bartender>{

	public BartenderDAO() {
		super(Bartender.class);
	}

}
