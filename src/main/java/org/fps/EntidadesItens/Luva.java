package org.fps.EntidadesItens;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Luva extends ItemDef {

	
	@Id
	@GeneratedValue
	private Long idLuva;
	
	@Column
	private double CtrlRecuo;

	public Long getIdLuva() {
		return idLuva;
	}

	public void setIdLuva(Long idLuva) {
		this.idLuva = idLuva;
	}

	public double getCtrlRecuo() {
		return CtrlRecuo;
	}

	public void setCtrlRecuo(double ctrlRecuo) {
		CtrlRecuo = ctrlRecuo;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(CtrlRecuo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((idLuva == null) ? 0 : idLuva.hashCode());
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
		Luva other = (Luva) obj;
		if (Double.doubleToLongBits(CtrlRecuo) != Double.doubleToLongBits(other.CtrlRecuo))
			return false;
		if (idLuva == null) {
			if (other.idLuva != null)
				return false;
		} else if (!idLuva.equals(other.idLuva))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Luva [idLuva=" + idLuva + ", CtrlRecuo=" + CtrlRecuo + "]";
	}

	public Luva(String descricao, double peso, double preco, double defesa, double camuflagem, Long idLuva,
			Double ctrlRecuo) {
		super(descricao, peso, preco, defesa, camuflagem);
		this.idLuva = idLuva;
		CtrlRecuo = ctrlRecuo;
	}

	public Luva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Luva(String descricao, double peso, double preco, double defesa, double camuflagem) {
		super(descricao, peso, preco, defesa, camuflagem);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
