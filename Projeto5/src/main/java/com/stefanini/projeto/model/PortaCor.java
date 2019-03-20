package com.stefanini.projeto.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class PortaCor implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PortaCorPK id;

	@ManyToOne
	@JoinColumn(name = "PO_NU", referencedColumnName = "PO_NU", insertable = false, updatable = false)
	private Porta porta;

	@ManyToOne
	@JoinColumn(name = "CO_NU", referencedColumnName = "CO_NU", insertable = false, updatable = false)
	private Cor cor;

	public PortaCor() {
		super();
	}

	public PortaCor(Porta porta, Cor cor) {
		super();
		this.id = new PortaCorPK(porta.getId(), cor.getId());
		this.porta = porta;
		this.cor = cor;
	}

	public PortaCorPK getId() {
		return id;
	}

	public void setId(PortaCorPK id) {
		this.id = id;
	}

	public Porta getPorta() {
		return porta;
	}

	public void setPorta(Porta porta) {
		this.porta = porta;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}