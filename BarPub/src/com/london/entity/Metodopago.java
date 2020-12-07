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
@NamedQuery(name="Metodopago.findAll", query="SELECT m FROM Metodopago m")
public class Metodopago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idMetodoPago;

	private String descripcion;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="metodopago")
	private List<Venta> ventas;

	public List<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Venta addVenta(Venta venta) {
		getVentas().add(venta);
		venta.setMetodopago(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setMetodopago(null);

		return venta;
	}

}