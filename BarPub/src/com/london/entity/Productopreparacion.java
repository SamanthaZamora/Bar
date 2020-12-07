package com.london.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQuery(name="Productopreparacion.findAll", query="SELECT p FROM Productopreparacion p")
public class Productopreparacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombreProducto;

	//bi-directional many-to-one association to Preparacion
	@OneToMany(mappedBy="productopreparacion")
	private List<Preparacion> preparacions;

	//bi-directional one-to-one association to Menu
	@OneToOne
	@JoinColumn(name="nombreProducto")
	private Menu menu;

	public Preparacion addPreparacion(Preparacion preparacion) {
		getPreparacions().add(preparacion);
		preparacion.setProductopreparacion(this);

		return preparacion;
	}

	public Preparacion removePreparacion(Preparacion preparacion) {
		getPreparacions().remove(preparacion);
		preparacion.setProductopreparacion(null);

		return preparacion;
	}

}