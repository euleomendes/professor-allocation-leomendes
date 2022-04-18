package com.project.professorallocationleo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departament")
public class Departament {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY ) 
	private Long id;
	
	@Column (length = 100, nullable = false)
	private String nome;

	public Departament() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Departament [nome=" + nome + ", id=" + id + "]";
	}

}
