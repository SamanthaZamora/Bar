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
@NamedQuery(name="Tipoconcepto.findAll", query="SELECT t FROM Tipoconcepto t")
public class Tipoconcepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoConcepto;

	private String descripcion;

	private int id;

	//bi-directional many-to-one association to Concepto
	@OneToMany(mappedBy="tipoconcepto")
	private List<Concepto> conceptos;

	
}