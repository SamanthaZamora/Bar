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
@NamedQuery(name="Nomina.findAll", query="SELECT n FROM Nomina n")
public class Nomina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idNomina;

	private int idConcepto;

	private int idEmpleado;

	private int idPeriodo;

	private int numContrato;

	//bi-directional many-to-one association to Concepto
	@ManyToOne
	@JoinColumn(name="idConcepto", insertable=false, updatable=false)
	private Concepto concepto;

	//bi-directional many-to-one association to Contrato
	@ManyToOne
	@JoinColumn(name="numContrato", insertable=false, updatable=false)
	private Contrato contrato;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="idEmpleado", insertable=false, updatable=false)
	private Empleado empleado;

	//bi-directional many-to-one association to Periodo
	@ManyToOne
	@JoinColumn(name="idPeriodo", insertable=false, updatable=false)
	private Periodo periodo;

}