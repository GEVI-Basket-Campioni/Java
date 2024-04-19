package com.corso;

public class Main {

	public static void main(String[] args) {
		
		Docente d = new Docente("Antonio", "Coronato", "CRNNTN...", "Ingegneria informatica", "ING-INF/05");
		
		
		System.out.println("SSD: "+d.getSsd());
		System.out.println("Cognome: "+d.getCognome());
	
		Studente s = new Studente("Mario", "Rossi", "MRN...", "Ingegneria informatica", "41/112");
		System.out.println("Matricola: "+s.getMatricola());
		System.out.println("Cognome: "+s.getCognome());
		
	}

}
