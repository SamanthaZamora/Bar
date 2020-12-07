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
@NamedQuery(name="Productocompraventa.findAll", query="SELECT p FROM Productocompraventa p")
public class Productocompraventa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombreProducto;

	//bi-directional one-to-one association to Menu
	@OneToOne
	@JoinColumn(name="nombreProducto")
	private Menu menu;

}