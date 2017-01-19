package org.fps.EntidadesItens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Explosiva extends Granada {

	@Id
	@GeneratedValue
	private long idExplosiva;
	
	@Column
	private double dano;

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}

	@Override
	public String toString() {
		return "Explosiva [idExplosiva=" + idExplosiva + ", dano=" + dano + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(dano);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (idExplosiva ^ (idExplosiva >>> 32));
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
		Explosiva other = (Explosiva) obj;
		if (Double.doubleToLongBits(dano) != Double.doubleToLongBits(other.dano))
			return false;
		if (idExplosiva != other.idExplosiva)
			return false;
		return true;
	}

	public Explosiva(double dano) {
		super();
		this.dano = dano;
	}

	public Explosiva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Explosiva(String descricao, double peso, double preco) {
		super(descricao, peso, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
