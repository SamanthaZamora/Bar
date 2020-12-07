package com.london.dao;


import com.london.entity.Menu;
import com.london.util.Conexion;
public class MenuDAO extends Conexion<Menu> implements GenericDao1<Menu>{

	public MenuDAO() {
		super(Menu.class);
	}

}
