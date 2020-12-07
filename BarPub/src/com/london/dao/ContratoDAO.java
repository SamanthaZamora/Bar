package com.london.dao;


import com.london.entity.Contrato;
import com.london.util.Conexion;

public class ContratoDAO extends Conexion<Contrato> implements GenericDao1<Contrato>{

	public ContratoDAO() {
		super(Contrato.class);
	}

}