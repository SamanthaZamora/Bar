package com.london.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="periodogastos")
@NamedQuery(name="Periodogasto.findAll", query="SELECT p FROM Periodogasto p")
public class Periodogasto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PeriodogastoPK id;

	private int refPago;

	private float valor;


	//bi-directional many-to-one association to Compra
	@ManyToOne
	@JoinColumn(name="idGastos", insertable=false, updatable=false)
	private Gasto gasto;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="idPerido", insertable=false, updatable=false)
	
	private Periodo periodo;

}