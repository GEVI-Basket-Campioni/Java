package com.corso;

import java.util.List;
import java.util.LinkedList;

public class Studente {
	private String nome;
	private String cognome;
	private String matricola;
	private List<Esame> esamiRegistrati;

	public Studente(String nome, String cognome, String matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		
		this.esamiRegistrati = new LinkedList();
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getMatricola() {
		return matricola;
	}
	
	public void registraEsame(Esame esame) {
		this.esamiRegistrati.add(esame);		
	}
	
	public List<Esame> getEsami() {
		return esamiRegistrati;
	}
}
