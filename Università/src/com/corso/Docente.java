package com.corso;

public class Docente extends Persona{
	private String ssd;

	public Docente(String nome, String cognome, String cf, String cdl, String ssd) {
		super(nome, cognome, cf, cdl);
		this.ssd = ssd;
	}

	public String getSsd() {
		return ssd;
	}
}
