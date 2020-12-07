package com.london.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombreProducto;

	private String descripcion;

	private float precio;


	//bi-directional many-to-one association to Pedidomenu
	@OneToMany(mappedBy="menu")
	private List<Pedidomenu> pedidomenus;

	//bi-directional many-to-one association to Preparacion
	@OneToMany(mappedBy="menu")
	private List<Preparacion> preparacions;

	//bi-directional one-to-one association to Productocompraventa
	@OneToOne(mappedBy="menu")
	private Productocompraventa productocompraventa;

	//bi-directional one-to-one association to Productopreparacion
	@OneToOne(mappedBy="menu")
	private Productopreparacion productopreparacion;

	
	public List<Pedidomenu> getPedidomenus() {
		return this.pedidomenus;
	}

	public void setPedidomenus(List<Pedidomenu> pedidomenus) {
		this.pedidomenus = pedidomenus;
	}

	public Pedidomenu addPedidomenus(Pedidomenu pedidomenus) {
		getPedidomenus().add(pedidomenus);
		pedidomenus.setMenu(this);

		return pedidomenus;
	}

	public Pedidomenu removePedidomenus(Pedidomenu pedidomenus) {
		getPedidomenus().remove(pedidomenus);
		pedidomenus.setMenu(null);

		return pedidomenus;
	}

	public List<Preparacion> getPreparacions() {
		return this.preparacions;
	}

	public void setPreparacions(List<Preparacion> preparacions) {
		this.preparacions = preparacions;
	}

	public Preparacion addPreparacion(Preparacion preparacion) {
		getPreparacions().add(preparacion);
		preparacion.setMenu(this);

		return preparacion;
	}

	public Preparacion removePreparacion(Preparacion preparacion) {
		getPreparacions().remove(preparacion);
		preparacion.setMenu(null);

		return preparacion;
	}

	public Productocompraventa getProductocompraventa() {
		return this.productocompraventa;
	}

	public void setProductocompraventa(Productocompraventa productocompraventa) {
		this.productocompraventa = productocompraventa;
	}

	public Productopreparacion getProductopreparacion() {
		return this.productopreparacion;
	}

	public void setProductopreparacion(Productopreparacion productopreparacion) {
		this.productopreparacion = productopreparacion;
	}

}