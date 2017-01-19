package org.fps.EntidadesItens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Arma extends Item{

	@Id
	@GeneratedValue
	private long idArma;
	
	@Column
	private double dano;
	
	@Column
	private double precisao;
	
	@Column
	private double ctrlRecuo;
	
	@Column
	private double camuflagem;

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}

	public double getPrecisao() {
		return precisao;
	}

	public void setPrecisao(double precisao) {
		this.precisao = precisao;
	}

	public double getCtrlRecuo() {
		return ctrlRecuo;
	}

	public void setCtrlRecuo(double ctrlRecuo) {
		this.ctrlRecuo = ctrlRecuo;
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
		temp = Double.doubleToLongBits(ctrlRecuo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dano);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (idArma ^ (idArma >>> 32));
		temp = Double.doubleToLongBits(precisao);
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
		Arma other = (Arma) obj;
		if (Double.doubleToLongBits(camuflagem) != Double.doubleToLongBits(other.camuflagem))
			return false;
		if (Double.doubleToLongBits(ctrlRecuo) != Double.doubleToLongBits(other.ctrlRecuo))
			return false;
		if (Double.doubleToLongBits(dano) != Double.doubleToLongBits(other.dano))
			return false;
		if (idArma != other.idArma)
			return false;
		if (Double.doubleToLongBits(precisao) != Double.doubleToLongBits(other.precisao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arma [idArma=" + idArma + ", dano=" + dano + ", precisao=" + precisao + ", ctrlRecuo=" + ctrlRecuo
				+ ", camuflagem=" + camuflagem + "]";
	}



	public Arma(double dano, double precisao, double ctrlRecuo, double camuflagem) {
		super();
		this.dano = dano;
		this.precisao = precisao;
		this.ctrlRecuo = ctrlRecuo;
		this.camuflagem = camuflagem;
	}

	public Arma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arma(String descricao, double peso, double preco) {
		super(descricao, peso, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
