package com.corso;

public class Studente extends Persona {
	private String matricola;

	public Studente(String nome, String cognome, String cf, String cdl, String matricola) {
		super(nome, cognome, cf, cdl);
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}
	
	
}
