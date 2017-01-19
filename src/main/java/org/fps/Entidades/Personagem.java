package org.fps.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personagem {

	@Id
	@GeneratedValue
	private long idPersonagem;
	
	@Column
	private String nome;
	
	@Column
	private String classe;
	
	@Column
	private double ctrlRecuo;
	
	@Column
	private double precisao;
	
	@Column
	private double reflexo;
	
	@Column
	private double exp;
	
	@Column
	private int level;
	
	@Column
	private double camuflagem;
	
	@Column
	private double defesa;
	
	@Column
	private double visibilidade;
	
	@Column
	private double velocidade;
	
	@Column
	private Equipamento equipamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public double getCtrlRecuo() {
		return ctrlRecuo;
	}

	public void setCtrlRecuo(double ctrlRecuo) {
		this.ctrlRecuo = ctrlRecuo;
	}

	public double getPrecisao() {
		return precisao;
	}

	public void setPrecisao(double precisao) {
		this.precisao = precisao;
	}

	public double getReflexo() {
		return reflexo;
	}

	public void setReflexo(double reflexo) {
		this.reflexo = reflexo;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getCamuflagem() {
		return camuflagem;
	}

	public void setCamuflagem(double camuflagem) {
		this.camuflagem = camuflagem;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

	public double getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(double visibilidade) {
		this.visibilidade = visibilidade;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(camuflagem);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		temp = Double.doubleToLongBits(ctrlRecuo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(defesa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((equipamento == null) ? 0 : equipamento.hashCode());
		temp = Double.doubleToLongBits(exp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + level;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(precisao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(reflexo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(velocidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(visibilidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Personagem other = (Personagem) obj;
		if (Double.doubleToLongBits(camuflagem) != Double.doubleToLongBits(other.camuflagem))
			return false;
		if (classe == null) {
			if (other.classe != null)
				return false;
		} else if (!classe.equals(other.classe))
			return false;
		if (Double.doubleToLongBits(ctrlRecuo) != Double.doubleToLongBits(other.ctrlRecuo))
			return false;
		if (Double.doubleToLongBits(defesa) != Double.doubleToLongBits(other.defesa))
			return false;
		if (equipamento == null) {
			if (other.equipamento != null)
				return false;
		} else if (!equipamento.equals(other.equipamento))
			return false;
		if (Double.doubleToLongBits(exp) != Double.doubleToLongBits(other.exp))
			return false;
		if (level != other.level)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(precisao) != Double.doubleToLongBits(other.precisao))
			return false;
		if (Double.doubleToLongBits(reflexo) != Double.doubleToLongBits(other.reflexo))
			return false;
		if (Double.doubleToLongBits(velocidade) != Double.doubleToLongBits(other.velocidade))
			return false;
		if (Double.doubleToLongBits(visibilidade) != Double.doubleToLongBits(other.visibilidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", classe=" + classe + ", ctrlRecuo=" + ctrlRecuo + ", precisao=" + precisao
				+ ", reflexo=" + reflexo + ", exp=" + exp + ", level=" + level + ", camuflagem=" + camuflagem
				+ ", defesa=" + defesa + ", visibilidade=" + visibilidade + ", velocidade=" + velocidade
				+ ", equipamento=" + equipamento + "]";
	}

	public Personagem(String nome, String classe, double ctrlRecuo, double precisao, double reflexo, double exp,
			int level, double camuflagem, double defesa, double visibilidade, double velocidade,
			Equipamento equipamento) {
		super();
		this.nome = nome;
		this.classe = classe;
		this.ctrlRecuo = ctrlRecuo;
		this.precisao = precisao;
		this.reflexo = reflexo;
		this.exp = exp;
		this.level = level;
		this.camuflagem = camuflagem;
		this.defesa = defesa;
		this.visibilidade = visibilidade;
		this.velocidade = velocidade;
		this.equipamento = equipamento;
	}

	public Personagem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
