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
public class PedidomenuPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int numPedido;

	@Column(insertable=false, updatable=false)
	private String nombreProducto;

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PedidomenuPK)) {
			return false;
		}
		PedidomenuPK castOther = (PedidomenuPK)other;
		return 
			(this.numPedido == castOther.numPedido)
			&& this.nombreProducto.equals(castOther.nombreProducto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numPedido;
		hash = hash * prime + this.nombreProducto.hashCode();
		
		return hash;
	}
}