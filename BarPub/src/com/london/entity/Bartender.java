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
@NamedQuery(name="Bartender.findAll", query="SELECT b FROM Bartender b")
public class Bartender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEmpleado;
	
	//bi-directional one-to-one association to Empleado
	@OneToOne
	@JoinColumn(name="idEmpleado")
	private Empleado empleado;
	
}