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
@Table(name="proveedores")
@NamedQuery(name="Proveedore.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@Column(insertable=false, updatable=false)
	private String razonSocial;

	private String nombreComercial;

	private String telefono;

	private String ubicacion;


	//bi-directional many-to-one association to Productoproveedor
	@OneToMany(mappedBy="proveedore")
	private List<Productoproveedor> productoproveedors;

	

	public List<Productoproveedor> getProductoproveedors() {
		return this.productoproveedors;
	}

	public void setProductoproveedors(List<Productoproveedor> productoproveedors) {
		this.productoproveedors = productoproveedors;
	}

	public Productoproveedor addProductoproveedor(Productoproveedor productoproveedor) {
		getProductoproveedors().add(productoproveedor);
		productoproveedor.setProveedore(this);

		return productoproveedor;
	}

	public Productoproveedor removeProductoproveedor(Productoproveedor productoproveedor) {
		getProductoproveedors().remove(productoproveedor);
		productoproveedor.setProveedore(null);

		return productoproveedor;
	}

}