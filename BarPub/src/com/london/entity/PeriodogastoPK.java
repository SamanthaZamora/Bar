package com.london.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class PeriodogastoPK implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idPeriodo;

	@Column(insertable=false, updatable=false)
	private int idGastos;

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductocompraPK)) {
			return false;
		}
		PeriodogastoPK castOther = (PeriodogastoPK)other;
		return 
			(this.idPeriodo == castOther.idPeriodo)
			&& (this.idGastos == castOther.idGastos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPeriodo;
		hash = hash * prime + this.idGastos;
		
		return hash;
	}

   
}
