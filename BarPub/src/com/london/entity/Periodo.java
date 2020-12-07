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
@NamedQuery(name="Periodo.findAll", query="SELECT p FROM Periodo p")
public class Periodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPerido;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;


	@Temporal(TemporalType.DATE)
	private Date fechaInicio;


	//bi-directional many-to-one association to Nomina
	@OneToMany(mappedBy="periodo")
	private List<Nomina> nominas;

	//bi-directional many-to-one association to Periodogasto
	@OneToMany(mappedBy="periodo")
	private List<Periodogasto> periodogastos;

	
	public List<Nomina> getNominas() {
		return this.nominas;
	}

	public void setNominas(List<Nomina> nominas) {
		this.nominas = nominas;
	}

	public Nomina addNomina(Nomina nomina) {
		getNominas().add(nomina);
		nomina.setPeriodo(this);

		return nomina;
	}

	public Nomina removeNomina(Nomina nomina) {
		getNominas().remove(nomina);
		nomina.setPeriodo(null);

		return nomina;
	}

	public List<Periodogasto> getPeriodogastos() {
		return this.periodogastos;
	}

	public void setPeriodogastos(List<Periodogasto> periodogastos) {
		this.periodogastos = periodogastos;
	}

	public Periodogasto addPeriodogasto(Periodogasto periodogasto) {
		getPeriodogastos().add(periodogasto);
		periodogasto.setPeriodo(this);

		return periodogasto;
	}

	public Periodogasto removePeriodogasto(Periodogasto periodogasto) {
		getPeriodogastos().remove(periodogasto);
		periodogasto.setPeriodo(null);

		return periodogasto;
	}

}