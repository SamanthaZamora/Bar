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
public class ProductoproveedorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idProducto;

	@Column(insertable=false, updatable=false)
	private String razonSocial;

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductoproveedorPK)) {
			return false;
		}
		ProductoproveedorPK castOther = (ProductoproveedorPK)other;
		return 
			(this.idProducto == castOther.idProducto)
			&& this.razonSocial.equals(castOther.razonSocial);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idProducto;
		hash = hash * prime + this.razonSocial.hashCode();
		
		return hash;
	}
}