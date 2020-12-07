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
@NamedQuery(name="Productoproveedor.findAll", query="SELECT p FROM Productoproveedor p")
public class Productoproveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductoproveedorPK id;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="idProducto", insertable=false, updatable=false)
	private Producto producto;

	//bi-directional many-to-one association to Proveedore
	@ManyToOne
	@JoinColumn(name="razonSocial", insertable=false, updatable=false)
	private Proveedor proveedore;
}