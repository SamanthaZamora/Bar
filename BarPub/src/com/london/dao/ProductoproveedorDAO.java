package com.london.dao;

import com.london.entity.Productoproveedor;
import com.london.util.Conexion;

public class ProductoproveedorDAO extends Conexion<Productoproveedor> implements GenericDao1<Productoproveedor>{

	public ProductoproveedorDAO() {
		super(Productoproveedor.class);
	}

}