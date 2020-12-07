package com.london.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQuery(name="Pedidomenu.findAll", query="SELECT p FROM Pedidomenu p")
public class Pedidomenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedidomenuPK id;

	private float cantidadPagada;


	private int cantidadProducto;


	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="nombreProducto", insertable=false, updatable=false)
	private Menu menu;

	//bi-directional many-to-one association to Pedido
	@ManyToOne
	@JoinColumn(name="numPedido", insertable=false, updatable=false)
	private Pedido pedido;

	
}