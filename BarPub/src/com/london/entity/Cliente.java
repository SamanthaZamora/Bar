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
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCliente;
	
	private String direccion;
	
	private String telefono;
	
	private String nombre;

	private String apellido;

	private String cedula;

	/**** cambios****/
	
	private String clave;

	private String email;

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedidos;

	public Cliente(String direccion, String telefono, String nombre, String apellido, String cedula,
			String clave, String email) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.clave = clave;
		this.email = email;
	}
}