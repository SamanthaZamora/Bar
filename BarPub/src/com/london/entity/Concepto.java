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
@NamedQuery(name="Concepto.findAll", query="SELECT c FROM Concepto c")
public class Concepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idConcepto;

	private String codConcepto;

	private String descripcion;

	private String estado;


	//bi-directional many-to-one association to Tipoconcepto
	@ManyToOne
	@JoinColumn(name="idTipoConcepto")
	private Tipoconcepto tipoconcepto;

	//bi-directional many-to-one association to Nomina
	@OneToMany(mappedBy="concepto")
	private List<Nomina> nominas;

	public Tipoconcepto getTipoconcepto() {
		return this.tipoconcepto;
	}

	public void setTipoconcepto(Tipoconcepto tipoconcepto) {
		this.tipoconcepto = tipoconcepto;
	}

	public List<Nomina> getNominas() {
		return this.nominas;
	}

	public void setNominas(List<Nomina> nominas) {
		this.nominas = nominas;
	}

	public Nomina addNomina(Nomina nomina) {
		getNominas().add(nomina);
		nomina.setConcepto(this);

		return nomina;
	}

	public Nomina removeNomina(Nomina nomina) {
		getNominas().remove(nomina);
		nomina.setConcepto(null);

		return nomina;
	}

}