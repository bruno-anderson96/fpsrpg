package org.fps.EntidadesItens;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Granada extends Item{

	@Id
	@GeneratedValue
	private long idGranada;

	public Granada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Granada(String descricao, double peso, double preco) {
		super(descricao, peso, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
