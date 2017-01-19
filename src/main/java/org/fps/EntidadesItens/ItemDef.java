package org.fps.EntidadesItens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemDef extends Item{

	@Id
	@GeneratedValue
	private long idItemDef;
	
	@Column
	private double defesa;
	
	@Column
	private double camuflagem;

	public long getIdItemDef() {
		return idItemDef;
	}

	public void setIdItemDef(long idItemDef) {
		this.idItemDef = idItemDef;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

	public double getCamuflagem() {
		return camuflagem;
	}

	public void setCamuflagem(double camuflagem) {
		this.camuflagem = camuflagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(camuflagem);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(defesa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (idItemDef ^ (idItemDef >>> 32));
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
		ItemDef other = (ItemDef) obj;
		if (Double.doubleToLongBits(camuflagem) != Double.doubleToLongBits(other.camuflagem))
			return false;
		if (Double.doubleToLongBits(defesa) != Double.doubleToLongBits(other.defesa))
			return false;
		if (idItemDef != other.idItemDef)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemDef [idItemDef=" + idItemDef + ", defesa=" + defesa + ", camuflagem=" + camuflagem + "]";
	}

	public ItemDef(String descricao, double peso, double preco, double defesa, double camuflagem) {
		super(descricao, peso, preco);
		this.defesa = defesa;
		this.camuflagem = camuflagem;
	}

	public ItemDef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDef(String descricao, double peso, double preco) {
		super(descricao, peso, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
