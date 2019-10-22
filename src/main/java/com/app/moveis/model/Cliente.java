package com.app.moveis.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa implements Serializable{
	
	
	private String rg;
	private String dataNascimento;
	
		
	
	public Cliente() {
		super();
		
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
