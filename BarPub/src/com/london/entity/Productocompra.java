package com.london.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQuery(name="Productocompra.findAll", query="SELECT p FROM Productocompra p")
public class Productocompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductocompraPK id;

	private int cantidad;

	//bi-directional many-to-one association to Compra
	@ManyToOne
	@JoinColumn(name="idCompra", insertable=false, updatable=false)
	private Compra compra;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="idProducto", insertable=false, updatable=false)
	private Producto producto;

}