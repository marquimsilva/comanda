package com.clj.comanda.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;



@Entity
public class Comidas {
	

	@Id
	@GeneratedValue
    private Long id;
	@Column
	private String pedido;
	@Column
  	private double qtd;
	@Column
  	private double mesa;
	@Column
	private String rfg;
	@Column
	private String crv;
	@Column
	private String tiraGosto;

	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public double getQtd() {
		return qtd;
	}
	public void setQtd(double qtd) {
		this.qtd = qtd;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public double getMesa() {
		return mesa;
	}
	public void setMesa(double Mesa) {
		this.mesa = mesa;
	}
	public String getRfg() {
		return rfg;
	}
	public void setRfg(String rfg) {
		this.rfg = rfg;
	}
	public String getCrv() {
		return crv;
	}
	public void setCrv(String crv) {
		this.crv = crv;
	}
	public String getTiraGosto() {
		return tiraGosto;
	}
	public void setTiraGosto(String tiraGosto) {
		this.tiraGosto = tiraGosto;
	}
}
