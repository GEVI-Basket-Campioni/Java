package com.corso;

public class Esame {
	private String codice;
	private String nome;
	private int cfu;

	public Esame(String codice, String nome, int cfu) {
		this.codice = codice;
		this.nome = nome;
		this.cfu = cfu;
	}

	public String getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public int getCfu() {
		return cfu;
	}
}
