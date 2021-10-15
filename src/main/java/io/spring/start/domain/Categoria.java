package io.spring.start.domain;

import java.io.Serializable; //interface que permite que a classe seja convertida em uma sequencia de bytes, para trafegar via http
import java.util.Objects;

public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//para comparar os obj pelo valor (conteúdo), e não pelo ponteiro
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	//comparação entre 2 obj levando varias possibilidades
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
}
