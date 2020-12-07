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
@Table(name="gastos")
@NamedQuery(name="Gasto.findAll", query="SELECT g FROM Gasto g")
public class Gasto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idGastos;

	private String concepto;

	private String descripcion;


	//bi-directional many-to-one association to Periodogasto
	@OneToMany(mappedBy="gasto")
	private List<Periodogasto> periodogastos;


	public List<Periodogasto> getPeriodogastos() {
		return this.periodogastos;
	}

	public void setPeriodogastos(List<Periodogasto> periodogastos) {
		this.periodogastos = periodogastos;
	}

	public Periodogasto addPeriodogasto(Periodogasto periodogasto) {
		getPeriodogastos().add(periodogasto);
		periodogasto.setGasto(this);

		return periodogasto;
	}

	public Periodogasto removePeriodogasto(Periodogasto periodogasto) {
		getPeriodogastos().remove(periodogasto);
		periodogasto.setGasto(null);

		return periodogasto;
	}

}