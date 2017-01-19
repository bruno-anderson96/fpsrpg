 package org.fps.EntidadesItens;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Acessorio extends Item{
	 
	 @Id
	 @GeneratedValue
	 private long idAcessorio;

	public Acessorio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Acessorio(String descricao, double peso, double preco) {
		super(descricao, peso, preco);
		// TODO Auto-generated constructor stub
	}
	 
	 
	 
	 
	 
}
