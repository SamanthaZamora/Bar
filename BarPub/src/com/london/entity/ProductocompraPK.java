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
@Embeddable
public class ProductocompraPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idCompra;

	@Column(insertable=false, updatable=false)
	private int idProducto;

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductocompraPK)) {
			return false;
		}
		ProductocompraPK castOther = (ProductocompraPK)other;
		return 
			(this.idCompra == castOther.idCompra)
			&& (this.idProducto == castOther.idProducto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCompra;
		hash = hash * prime + this.idProducto;
		
		return hash;
	}
}