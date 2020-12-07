package com.london.dao;

import com.london.entity.Tipoconcepto;
import com.london.util.Conexion;

public class TipoconceptoDAO extends Conexion<Tipoconcepto> implements GenericDao1<Tipoconcepto>{

	public TipoconceptoDAO() {
		super(Tipoconcepto.class);
	}

}
