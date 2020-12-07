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
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numPedido;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;

	//bi-directional many-to-one association to Venta
	@ManyToOne
	@JoinColumn(name="idVenta")
	private Venta venta;

	//bi-directional many-to-one association to Pedidomenu
	@OneToMany(mappedBy="pedido")
	private List<Pedidomenu> pedidomenus;

	public List<Pedidomenu> getPedidomenus() {
		return this.pedidomenus;
	}

	public void setPedidomenus(List<Pedidomenu> pedidomenus) {
		this.pedidomenus = pedidomenus;
	}

	public Pedidomenu addPedidomenus(Pedidomenu pedidomenus) {
		getPedidomenus().add(pedidomenus);
		pedidomenus.setPedido(this);

		return pedidomenus;
	}

	public Pedidomenu removePedidomenus(Pedidomenu pedidomenus) {
		getPedidomenus().remove(pedidomenus);
		pedidomenus.setPedido(null);

		return pedidomenus;
	}

}