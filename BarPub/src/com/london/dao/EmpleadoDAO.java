package com.london.dao;


import com.london.entity.Empleado;
import com.london.util.Conexion;
public class EmpleadoDAO  extends Conexion<Empleado> implements GenericDao1<Empleado>{

	public EmpleadoDAO() {
		super(Empleado.class);
	}

}
