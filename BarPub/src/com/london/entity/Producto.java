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
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idProducto;

	private String categoria;

	@Lob
	private String descripcion;

	private String detalle;

	private String imagen;

	private String linea;

	private float precio;

	private String referencia;

	//bi-directional many-to-one association to Preparacion
	@OneToMany(mappedBy="producto")
	private List<Preparacion> preparacions;

	//bi-directional many-to-one association to Productocompra
	@OneToMany(mappedBy="producto")
	private List<Productocompra> productocompras;

	//bi-directional many-to-one association to Productoproveedor
	@OneToMany(mappedBy="producto")
	private List<Productoproveedor> productoproveedors;

	public Preparacion addPreparacion(Preparacion preparacion) {
		getPreparacions().add(preparacion);
		preparacion.setProducto(this);

		return preparacion;
	}

	public Preparacion removePreparacion(Preparacion preparacion) {
		getPreparacions().remove(preparacion);
		preparacion.setProducto(null);

		return preparacion;
	}

	public List<Productocompra> getProductocompras() {
		return this.productocompras;
	}

	public void setProductocompras(List<Productocompra> productocompras) {
		this.productocompras = productocompras;
	}

	public Productocompra addProductocompra(Productocompra productocompra) {
		getProductocompras().add(productocompra);
		productocompra.setProducto(this);

		return productocompra;
	}

	public Productocompra removeProductocompra(Productocompra productocompra) {
		getProductocompras().remove(productocompra);
		productocompra.setProducto(null);

		return productocompra;
	}

	public List<Productoproveedor> getProductoproveedors() {
		return this.productoproveedors;
	}

	public void setProductoproveedors(List<Productoproveedor> productoproveedors) {
		this.productoproveedors = productoproveedors;
	}

	public Productoproveedor addProductoproveedor(Productoproveedor productoproveedor) {
		getProductoproveedors().add(productoproveedor);
		productoproveedor.setProducto(this);

		return productoproveedor;
	}

	public Productoproveedor removeProductoproveedor(Productoproveedor productoproveedor) {
		getProductoproveedors().remove(productoproveedor);
		productoproveedor.setProducto(null);

		return productoproveedor;
	}

}