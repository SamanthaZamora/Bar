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
@NamedQuery(name="Administrador.findAll", query="SELECT a FROM Administrador a")

public class Administrador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEmpleado;
	
	private String clave;

	//bi-directional one-to-one association to Empleado
	@OneToOne
	@JoinColumn(name="idEmpleado")
	private Empleado empleado;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="administrador")
	private List<Venta> ventas;


	public Venta addVenta(Venta venta) {
		getVentas().add(venta);
		venta.setAdministrador(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setAdministrador(null);

		return venta;
	}

	public Administrador(int idEmpleado, String clave) {
		super();
		this.idEmpleado = idEmpleado;
		this.clave = clave;
	}
	
	

}