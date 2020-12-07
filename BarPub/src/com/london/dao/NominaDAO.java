package com.london.dao;


import com.london.entity.Nomina;
import com.london.util.Conexion;

public class NominaDAO extends Conexion<Nomina> implements GenericDao1<Nomina>{

	public NominaDAO() {
		super(Nomina.class);
	}

}