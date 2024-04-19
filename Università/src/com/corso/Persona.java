package com.corso;

public class Persona {
	private String nome;
	private String cognome;
	private String cf;
	private String cdl;

	
	public Persona(String nome, String cognome, String cf, String cdl) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.cdl = cdl;
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}


	public String getCf() {
		return cf;
	}


	public String getCdl() {
		return cdl;
	}
}
