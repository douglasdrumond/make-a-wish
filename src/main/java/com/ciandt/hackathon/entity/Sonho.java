/**
 * 
 */
package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * @author Amanda
 * 
 */
@Entity
@Index
public class Sonho {

	@Id
	private Long id;

	private String nome;

	private String descricao;

	private String crianca;

	private Boolean comprado;
		
	
	public Sonho() {
		super();
	}

	public Sonho(String nome, String descricao, String crianca, Boolean comprado) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.crianca = crianca;
		this.comprado = comprado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCrianca() {
		return crianca;
	}

	public void setCrianca(String crianca) {
		this.crianca = crianca;
	}

	public Boolean getComprado() {
		return comprado;
	}

	public void setComprado(Boolean comprado) {
		this.comprado = comprado;
	}

}