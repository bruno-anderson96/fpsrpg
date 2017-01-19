package org.fps.EntidadesItens;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Colete extends ItemDef{

	@Id
	@GeneratedValue
	private long idColete;

	public Colete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Colete(String descricao, double peso, double preco, double defesa, double camuflagem) {
		super(descricao, peso, preco, defesa, camuflagem);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
