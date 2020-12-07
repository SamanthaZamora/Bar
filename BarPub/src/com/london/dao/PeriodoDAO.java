package com.london.dao;

import com.london.entity.Periodo;
import com.london.util.Conexion;

public class PeriodoDAO extends Conexion<Periodo> implements GenericDao1<Periodo>{

	public PeriodoDAO() {
		super(Periodo.class);
	}

}
