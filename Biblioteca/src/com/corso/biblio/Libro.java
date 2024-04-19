package com.corso.biblio;

public class Libro {
	private String titolo;
	private String genere;
	private Autore autore;
	
	public Libro(String titolo, String genere, Autore autore) {
		this.autore = autore;
		this.genere = genere;
		this.titolo = titolo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public Autore getAutore() {
		return autore;
	}

}
