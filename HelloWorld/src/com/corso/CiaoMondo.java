package com.corso;

public class CiaoMondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String messaggio;
		
		messaggio = "Ciao, mi chiamo Antonio";

		System.out.println(messaggio);
		
		
		String messaggio2 = " sto facendo lezione";
		
		String msg = messaggio + messaggio2;
		System.out.println(msg);
		
		if(msg.contains("Antonio"))
			System.out.println("Si contiene la parola cercata!");
		else
			System.out.print("No! NOn contiene la parola cercata.");
		
		if(messaggio.equals("Ciao, mi chiamo Antonio"))
			System.out.println("Si! Le due stringhe coincidono!");
		else
			System.out.print("No! Non coincidono.");
			
	}
}
