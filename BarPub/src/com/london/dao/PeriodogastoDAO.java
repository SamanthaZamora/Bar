package com.london.dao;

import com.london.entity.Periodogasto;
import com.london.util.Conexion;

public class PeriodogastoDAO extends Conexion<Periodogasto> implements GenericDao1<Periodogasto>{

	public PeriodogastoDAO() {
		super(Periodogasto.class);
	}

}
