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
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idVenta;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int numPedido;

	private float precio;


	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="venta")
	private List<Pedido> pedidos;

	//bi-directional many-to-one association to Administrador
	@ManyToOne
	@JoinColumn(name="idEmpleado")
	private Administrador administrador;

	//bi-directional many-to-one association to Metodopago
	@ManyToOne
	@JoinColumn(name="idMetodoPago")
	private Metodopago metodopago;

	public Pedido addPedido(Pedido pedido) {
		getPedidos().add(pedido);
		pedido.setVenta(this);

		return pedido;
	}

	public Pedido removePedido(Pedido pedido) {
		getPedidos().remove(pedido);
		pedido.setVenta(null);

		return pedido;
	}
}