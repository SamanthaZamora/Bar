package com.london.dao;

import com.london.entity.Administrador;
import com.london.util.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdministradorDAO extends Conexion<Administrador> implements GenericDao1<Administrador>{

	public AdministradorDAO() {
		super(Administrador.class);
	}
	

}
