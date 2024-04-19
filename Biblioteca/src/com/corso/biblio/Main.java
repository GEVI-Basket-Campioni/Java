package com.corso.biblio;

public class Main {

	public static void main(String[] args) {
		Libro l1;
		Libro l2;

		Autore a1 = new Autore("Umberto","Eco");
		
		l1 = new Libro("IL nome della rosa","Romanzo",a1);
		
		System.out.println("Il titolo è: "+l1.getTitolo());
		System.out.println("L'autore è: "+l1.getAutore().getNome());
		
	}

}
