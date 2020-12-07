package com.london.dao;


import com.london.entity.Concepto;
import com.london.util.Conexion;

public class ConceptoDAO extends Conexion<Concepto> implements GenericDao1<Concepto>{

	public ConceptoDAO() {
		super(Concepto.class);
	}

}