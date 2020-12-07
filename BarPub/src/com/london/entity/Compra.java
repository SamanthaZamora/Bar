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
@NamedQuery(name="Compra.findAll", query="SELECT c FROM Compra c")
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCompra;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String razonSocial;


	//bi-directional many-to-one association to Productocompra
	@OneToMany(mappedBy="compra")
	private List<Productocompra> productocompras;

	
	public List<Productocompra> getProductocompras() {
		return this.productocompras;
	}

	public void setProductocompras(List<Productocompra> productocompras) {
		this.productocompras = productocompras;
	}

	public Productocompra addProductocompra(Productocompra productocompra) {
		getProductocompras().add(productocompra);
		productocompra.setCompra(this);

		return productocompra;
	}

	public Productocompra removeProductocompra(Productocompra productocompra) {
		getProductocompras().remove(productocompra);
		productocompra.setCompra(null);

		return productocompra;
	}

}