/*
 *@author Taddia Davide 
 * 
 *@version 0.1
 * 
 */

package mainregistry;
import java.util.Scanner;

import cittadino.Cittadino;
import cittadino.Persona;


public class Main {

	public static void main(String[] args) 
	{
		//Costruzione di una persona dati dei parametri da programma 
		//istanza di persona
		Persona p = new Persona("Davide Taddia", 1995  ); // in caso di dimenticanza di import 
		//System.out.println(p.toString()); funziona lo stesso ma molto meglio (p) per passargli persona 
		System.out.println(p);
		
		
		// Anagrafe ti chiede di inserire i dati e crea un uovo cittadino 
		//nome scan 
	    Scanner nome = new Scanner(System.in);
	    
	    System.out.println("Nome:");
	    Scanner scanner;
		String nome1 = scanner.nextLine();
	       //cognome scan
	    Scanner cognome = new Scanner(System.in);
	    
	    System.out.println("Cognome:");
	    String cognome1 = scanner.nextLine();
	       //BirthDate scan 
	    Scanner bdate = new Scanner(System.in);
	    
	    System.out.println("Data di Nascita in formato AAMMGG:");
	    String bdate1 = scanner.nextLine();
	   //nome1 e cognome 1 mi sono state imposte da assertation non capisco perche 
	    Object residenza;
	    Object bDate;
		Object domicilio;
		Cittadino Cittadino = new Cittadino(nome1,cognome1, bDate,codiceFiscale, age,residenza, domicilio);
	scanner.close();
	
	//Calcolo codice fiscale
	
	//Esempio Cognome
	
	//Esempio Nome
	
	//Esempio BDay
	
    // Esempio CodiceComune
    String codiceFiscale = "RSSMRA87M01H501W"; // Codice fiscale di esempio
    String codiceComune = estraiCodiceComune(codiceFiscale);
    System.out.println("Codice del comune estratto dal codice fiscale: " + codiceComune);
	String codiceFiscale = "";
	
	// Aggiungi carattere di controllo
    codiceFiscale += checkChar(codiceFiscale);
    
    // Stampa il codice fiscale
    System.out.println("Il tuo codice fiscale è: " + codiceFiscale);
	}

}
