package com.corso;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		List<Esame> elencoEsami = new LinkedList();
		List<Studente> elencoStudenti = new LinkedList();

		Scanner in = new Scanner(System.in);

		int scelta = 0;
		
		while(scelta<7) {
			System.out.println();
			System.out.println();
			
			System.out.println("*** Operazioni possibili: ");
			System.out.println("*** ");
			System.out.println("*** 1 - Inserimento di un nuovo esame ");
			System.out.println("*** 2 - Visualizzazione di tutti gli esami ");
			System.out.println("*** 3 - Inserimento di un nuovo studente ");
			System.out.println("*** 4 - Visualizzazione di tutti gli studenti ");
			System.out.println("*** 5 - Registra esame ");
			System.out.println("*** 6 - Visualizzazione esami di uno studente ");
			System.out.println("*** 7 - Termina ");
			System.out.println("*** ");
			System.out.print("*** Inserisci la tua scelta: ");
			
			scelta = in.nextInt();
			
			switch(scelta) {
			case 1 :
				System.out.println("Hai scelto di inserire un nuovo esame!");
				System.out.println();
				
				System.out.print("Inserisci codice esame: ");
				String codice = in.next();
				
				System.out.print("Inserisci nome: ");
				String nome = in.next();

				System.out.print("Inserisci CFU: ");
				int cfu = in.nextInt();

				Esame e = new Esame(codice,nome,cfu);
				
				elencoEsami.add(e);
				
				break;
				
			case 2 :
				System.out.println("Hai scelto di visualizzare gli esami!");
				System.out.println();
				
				int i=0;
				
				while(i<elencoEsami.size()) {
					System.out.println("Esame: "+elencoEsami.get(i).getCodice()+" --- Nome: "
							+elencoEsami.get(i).getNome()+ " --- CFU: "+elencoEsami.get(i).getCfu());
					
					i++;
				}
				
				break;
			
			case 3 :
				System.out.println("Hai scelto di inserire un nuovo studente!");
				System.out.println();
				
				System.out.print("Inserisci matricola: ");
				String matricola = in.next();
				
				System.out.print("Inserisci nome: ");
				nome = in.next();

				System.out.print("Inserisci cognome: ");
				String cognome = in.next();

				Studente s = new Studente(nome,cognome,matricola);
				
				elencoStudenti.add(s);
				
				break;
				
			case 4 :
				System.out.println("Hai scelto di visualizzare gli studenti!");
				System.out.println();
				
				i=0;
				
				while(i<elencoStudenti.size()) {
					System.out.println("Studente: "+elencoStudenti.get(i).getMatricola()+" "
							+elencoStudenti.get(i).getCognome());
					
					i++;
				}
				
				break;

			case 5 :
				System.out.println("Hai scelto di registrare un esame!");

				System.out.print("Inserisci matricola: ");
				matricola = in.next();
				
				System.out.print("Inserisci il codice dell'esame: ");
				codice = in.next();

				Esame esame = null;
				
				i = 0;
				boolean trovato = false;
				
				while(i<elencoEsami.size() && !trovato) {
					if(elencoEsami.get(i).getCodice().equals(codice)) {
						esame = elencoEsami.get(i);
						
						trovato = true; 
					}
					
					i++;
				}
				
				if(trovato)	 {
					trovato = false;
					
					i = 0;
					
					while(i<elencoStudenti.size() && !trovato) {
						if(elencoStudenti.get(i).getMatricola().equals(matricola)) {
							elencoStudenti.get(i).registraEsame(esame);
							
							trovato = true; 
						}
						
						i++;
					}
				}


				
				break;

			case 6 :
				Studente studente = null;
				
				System.out.println("Hai scelto di visualizzare gli esami di uno studente!");

				System.out.print("Inserisci matricola: ");
				matricola = in.next();
				
				i = 0;
				trovato = false;
				
				while(i<elencoStudenti.size() && !trovato) {
					if(elencoStudenti.get(i).getMatricola().equals(matricola)) {
						studente = elencoStudenti.get(i);
						
						trovato = true; 
					}
					
					i++;
				}
				
				if(trovato)	 {
					List<Esame> esamiSostenuti = studente.getEsami();

					i = 0;
					
					while(i<esamiSostenuti.size()) {
						System.out.println("Esame: "+esamiSostenuti.get(i).getNome()+" --- CFU: "+esamiSostenuti.get(i).getCfu());
						
						i++;
					}
				}


				
				break;

			case 7 :
				System.out.println("Hai scelto di terminare!");
				break;
			}
		}
				
	}
}
