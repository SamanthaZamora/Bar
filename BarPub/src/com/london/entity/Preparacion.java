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
@NamedQuery(name="Preparacion.findAll", query="SELECT p FROM Preparacion p")
public class Preparacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PreparacionPK id;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="nombreProducto", insertable=false, updatable=false)
	private Menu menu;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="idProducto", insertable=false, updatable=false)
	private Producto producto;

	//bi-directional many-to-one association to Productopreparacion
	@ManyToOne
	@JoinColumn(name="nombreProducto", insertable=false, updatable=false)
	private Productopreparacion productopreparacion;

}