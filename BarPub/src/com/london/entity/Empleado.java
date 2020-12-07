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
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEmpleado;
	
	private String nombre;

	private String telefono;

	private String apellido;

	private String cargo;

	private String cedula;

	private String email;

	private String direccion;

	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Temporal(TemporalType.DATE)
	private Date fechaRetiro;

	//bi-directional one-to-one association to Administrador
	@OneToOne(mappedBy="empleado")
	private Administrador administrador;

	//bi-directional one-to-one association to Bartender
	@OneToOne(mappedBy="empleado")
	private Bartender bartender;

	//bi-directional one-to-one association to Cocinero
	@OneToOne(mappedBy="empleado")
	private Cocinero cocinero;

	//bi-directional many-to-one association to Contrato
	@OneToMany(mappedBy="empleado")
	private List<Contrato> contratos;

	//bi-directional one-to-one association to Mesero
	@OneToOne(mappedBy="empleado")
	private Mesero mesero;

	//bi-directional many-to-one association to Nomina
	@OneToMany(mappedBy="empleado")
	private List<Nomina> nominas;

	
	public List<Contrato> getContratos() {
		return this.contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Contrato addContrato(Contrato contrato) {
		getContratos().add(contrato);
		contrato.setEmpleado(this);

		return contrato;
	}

	public Contrato removeContrato(Contrato contrato) {
		getContratos().remove(contrato);
		contrato.setEmpleado(null);

		return contrato;
	}

	public List<Nomina> getNominas() {
		return this.nominas;
	}

	public void setNominas(List<Nomina> nominas) {
		this.nominas = nominas;
	}

	public Nomina addNomina(Nomina nomina) {
		getNominas().add(nomina);
		nomina.setEmpleado(this);

		return nomina;
	}

	public Nomina removeNomina(Nomina nomina) {
		getNominas().remove(nomina);
		nomina.setEmpleado(null);

		return nomina;
	}

}