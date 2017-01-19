package org.fps.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.fps.EntidadesItens.Acessorio;
import org.fps.EntidadesItens.Arma;
import org.fps.EntidadesItens.Capacete;
import org.fps.EntidadesItens.Colete;
import org.fps.EntidadesItens.Granada;
import org.fps.EntidadesItens.Luva;

@Entity
public class Equipamento {
	
	@Id
	@GeneratedValue
	private long idEquipamento;
	
	@Column
	private Capacete capacete;
	
	@Column
	private Colete colete;
	
	@Column
	private Arma arma;
	
	@Column
	private Luva luva;
	
	@Column
	private Acessorio acessorio;
	
	@Column
	private Granada granada;

	public long getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(long idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public Capacete getCapacete() {
		return capacete;
	}

	public void setCapacete(Capacete capacete) {
		this.capacete = capacete;
	}

	public Colete getColete() {
		return colete;
	}

	public void setColete(Colete colete) {
		this.colete = colete;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Luva getLuva() {
		return luva;
	}

	public void setLuva(Luva luva) {
		this.luva = luva;
	}

	public Acessorio getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}

	public Granada getGranada() {
		return granada;
	}

	public void setGranada(Granada granada) {
		this.granada = granada;
	}

	@Override
	public String toString() {
		return "Equipamento [idEquipamento=" + idEquipamento + ", capacete=" + capacete + ", colete=" + colete
				+ ", arma=" + arma + ", luva=" + luva + ", acessorio=" + acessorio + ", granada=" + granada + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acessorio == null) ? 0 : acessorio.hashCode());
		result = prime * result + ((arma == null) ? 0 : arma.hashCode());
		result = prime * result + ((capacete == null) ? 0 : capacete.hashCode());
		result = prime * result + ((colete == null) ? 0 : colete.hashCode());
		result = prime * result + ((granada == null) ? 0 : granada.hashCode());
		result = prime * result + (int) (idEquipamento ^ (idEquipamento >>> 32));
		result = prime * result + ((luva == null) ? 0 : luva.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamento other = (Equipamento) obj;
		if (acessorio == null) {
			if (other.acessorio != null)
				return false;
		} else if (!acessorio.equals(other.acessorio))
			return false;
		if (arma == null) {
			if (other.arma != null)
				return false;
		} else if (!arma.equals(other.arma))
			return false;
		if (capacete == null) {
			if (other.capacete != null)
				return false;
		} else if (!capacete.equals(other.capacete))
			return false;
		if (colete == null) {
			if (other.colete != null)
				return false;
		} else if (!colete.equals(other.colete))
			return false;
		if (granada == null) {
			if (other.granada != null)
				return false;
		} else if (!granada.equals(other.granada))
			return false;
		if (idEquipamento != other.idEquipamento)
			return false;
		if (luva == null) {
			if (other.luva != null)
				return false;
		} else if (!luva.equals(other.luva))
			return false;
		return true;
	}

	public Equipamento(Capacete capacete, Colete colete, Arma arma, Luva luva, Acessorio acessorio,
			Granada granada) {
		super();
		this.capacete = capacete;
		this.colete = colete;
		this.arma = arma;
		this.luva = luva;
		this.acessorio = acessorio;
		this.granada = granada;
	}

	public Equipamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
