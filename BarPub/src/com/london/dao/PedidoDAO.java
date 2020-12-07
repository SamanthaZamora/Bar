package com.london.dao;

import com.london.entity.Pedido;
import com.london.util.Conexion;

public class PedidoDAO extends Conexion<Pedido> implements GenericDao1<Pedido>{

	public PedidoDAO() {
		super(Pedido.class);
	}

}
