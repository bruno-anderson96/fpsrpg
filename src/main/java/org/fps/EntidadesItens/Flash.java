package org.fps.EntidadesItens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flash extends Granada{

	@Id
	@GeneratedValue
	private long idFlash;
	
	@Column
	private double visibilidade;

	public long getIdFlash() {
		return idFlash;
	}

	public void setIdFlash(long idFlash) {
		this.idFlash = idFlash;
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
		result = prime * result + (int) (idFlash ^ (idFlash >>> 32));
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
		Flash other = (Flash) obj;
		if (idFlash != other.idFlash)
			return false;
		if (Double.doubleToLongBits(visibilidade) != Double.doubleToLongBits(other.visibilidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flash [idFlash=" + idFlash + ", visibilidade=" + visibilidade + "]";
	}

	public Flash(double visibilidade) {
		super();
		this.visibilidade = visibilidade;
	}

	public Flash() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flash(String descricao, double peso, double preco) {
		super(descricao, peso, preco);
		// TODO Auto-generated constructor stub
	}

	

	
	
	
}
