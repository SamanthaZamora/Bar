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
@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numContrato;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;


	@Temporal(TemporalType.DATE)
	private Date fechaInicio;


	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="idEmpleado")
	private Empleado empleado;

	//bi-directional many-to-one association to Nomina
	@OneToMany(mappedBy="contrato")
	private List<Nomina> nominas;

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Nomina> getNominas() {
		return this.nominas;
	}

	public void setNominas(List<Nomina> nominas) {
		this.nominas = nominas;
	}

	public Nomina addNomina(Nomina nomina) {
		getNominas().add(nomina);
		nomina.setContrato(this);

		return nomina;
	}

	public Nomina removeNomina(Nomina nomina) {
		getNominas().remove(nomina);
		nomina.setContrato(null);

		return nomina;
	}

}