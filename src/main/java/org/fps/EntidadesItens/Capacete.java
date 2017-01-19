package org.fps.EntidadesItens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Capacete extends ItemDef {

	@Id
	@GeneratedValue
	private long idCapacete;
	
	@Column
	private double visibilidade;

	public long getIdCapacete() {
		return idCapacete;
	}

	public void setIdCapacete(long idCapacete) {
		this.idCapacete = idCapacete;
	}

	public double getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(double visibilidade) {
		this.visibilidade = visibilidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (idCapacete ^ (idCapacete >>> 32));
		long temp;
		temp = Double.doubleToLongBits(visibilidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capacete other = (Capacete) obj;
		if (idCapacete != other.idCapacete)
			return false;
		if (Double.doubleToLongBits(visibilidade) != Double.doubleToLongBits(other.visibilidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Capacete [idCapacete=" + idCapacete + ", visibilidade=" + visibilidade + "]";
	}

	public Capacete(String descricao, double peso, double preco, double defesa, double camuflagem,
			double visibilidade) {
		super(descricao, peso, preco, defesa, camuflagem);
		this.visibilidade = visibilidade;
	}

	public Capacete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capacete(String descricao, double peso, double preco, double defesa, double camuflagem) {
		super(descricao, peso, preco, defesa, camuflagem);
		// TODO Auto-generated constructor stub
	}


	
	
	
}
