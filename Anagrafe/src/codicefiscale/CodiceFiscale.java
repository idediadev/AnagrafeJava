/*
 *@author Taddia Davide 
 * 
 *@version 0.1
 * 
 */


package codicefiscale;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CodiceFiscale {

	//Carattere di controllo 
	 public static char checkChar(String codiceFiscale) {
	        
		 //Cosa mi aspetto come valore finale
		 final String caratteri = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        //Algoritmo di Luhn con il quale usando due scale di riferimento e utilizzando il modulo 26 del resto determino il charattere di controllo
	        int somma = 0;
	        for (int i = 0; i < codiceFiscale.length(); i++) 
	        {
	            char c = codiceFiscale.charAt(i);
	            int valore;
	            if (Character.isDigit(c)) 
	            {
	                valore = Character.getNumericValue(c);
	            } else 
	            {
	                valore = caratteri.indexOf(c);
	            }
	            
	            // Se la posizione è dispari, moltiplica per 2
	            if (i % 2 == 0) 
	            {
	                valore *= 2;
	                // Se il risultato è maggiore di 9, sottrai 9
	                if (valore > 9) 
	                {
	                    valore -= 9;
	                }
	            }
	            somma += valore;
	        }
	        
	        // Calcola il resto della divisione per 26 e trova il carattere corrispondente
	        int resto = somma % 26;
	        char carattereControllo = caratteri.charAt(resto);
	        
	        return carattereControllo;
	    }
	//Cognome calcolo 
	  public static String estraiCognome(String codiceFiscale) 
	  {
	        // Prendi le prime tre lettere del codice fiscale
	        String primaTerzina = codiceFiscale.substring(0, 3);
	        
	        StringBuilder cognomeBuilder = new StringBuilder();
	        
	        String cognomeSenzaVocali = primaTerzina.replaceAll("[AEIOU]", "");
	       
	        /*int index = 0;
	        while (cognomeBuilder.length() < 3 && index < primaTerzina.length())
	         {
	            char lettera = primaTerzina.charAt(index);
	            if (!isVocale(lettera)) 
	            {
	                cognomeBuilder.append(lettera);
	            }
	            index++;
	        }*/
	        // Se il cognome ha meno di tre caratteri, riempi con vocali e "X"
	        while (cognomeBuilder.length() < 3) 
	        {
	            cognomeBuilder.append('X');
	        }
	        
	    }
	  //Nome Calcolo 
	  public static String estraiNome(String codiceFiscale) 
	  {
	        // Prendi le prime tre lettere del codice fiscale
	        String secondaTerzina = codiceFiscale.substring(0, 3);
	        
	        StringBuilder cognomeBuilder = new StringBuilder();
	        
	        String cognomeSenzaVocali = secondaTerzina.replaceAll("[AEIOU]", "");
	       
	        /*int index = 0;
	        while (cognomeBuilder.length() < 3 && index < primaTerzina.length())
	         {
	            char lettera = primaTerzina.charAt(index);
	            if (!isVocale(lettera)) 
	            {
	                cognomeBuilder.append(lettera);
	            }
	            index++;
	        }*/
	        // Se il cognome ha meno di tre caratteri, riempi con vocali e "X"
	        while (cognomeBuilder.length() < 3) 
	        {
	            cognomeBuilder.append('X');
	        }
	        
	    }
	  //bDay array di 4 charatteri 
	  public static String estraiDataNascita(String dataNascita)
	  {
	        StringBuilder dataStringBuilder = new StringBuilder();
	        
	        // Aggiungi le ultime due cifre dell'anno di nascita
	        String anno = dataNascita.substring(0, 1);
	        dataStringBuilder.append(anno);
	        
	        // Mappa il mese di nascita a una lettera
	        //Array riferimento
	        String mappaMese = " ABCDEHLMPRST";
	        
	        String letteraMese = "";
			
			if(dataNascita(2) > 12)
			{
				valore = "ERRORE non esiste il 13esimo mese o altro !!";
			}
			else 
			{
				for(int i = 0; i < mesi.length(); i++)
				{
					if(mese == i)
					{
						char carattere = mappaMese.charAt(i);
						letteraMese += carattere;
					}
				}
			}
			return letteraMese;


	        char mese = dataNascita.charAt(2);
	        char letteraMese = mappaMese(mese);
	        dataStringBuilder.append(letteraMese);
	        
	        // Aggiungi il giorno di nascita
	        String giorno = dataNascita.substring(8, 10);
	        if (Integer.parseInt(giorno) < 10) {
	            dataStringBuilder.append("0"); // Aggiungi lo zero se il giorno è compreso tra 1 e 9
	        }
	        dataStringBuilder.append(giorno);
	        
	        return dataStringBuilder.toString();
	    }
	  public class TestMonthMapping {
		  
		        char letteraMese = 'B'; // Ad esempio, 'B' rappresenta Febbraio nel codice fiscale italiano
		        Month month = mappaMese(letteraMese);
		        System.out.println("Il mese corrispondente è: " + month);
		    }
/*
	  private static char mappaMese(char mese) 
	  {
	        switch (mese) 
	        {
	            case '1': return 'A'; // Gennaio
	            case '2': return 'B'; // Febbraio
	            case '3': return 'C'; // Marzo
	            case '4': return 'D'; // Aprile
	            case '5': return 'E'; // Maggio
	            case '6': return 'H'; // Giugno
	            case '7': return 'L'; // Luglio
	            case '8': return 'M'; // Agosto
	            case '9': return 'P'; // Settembre
	            case '10': return 'R'; // Ottobre
	            case '11': return 'S'; // Novembre
	            case '12': return 'T'; // Dicembre
	            //vorrei evitarlo e gestirlo con dei worning o assertation 
	            default: return 'X'; // Nel caso di valore non valido, torna "X"
	        }
	    }
	*/	
	 //Comune array di 4 caratteri che identifica il comune di nascita 
	  
	  public class EstraiCodiceComune
	  {
		    
		    // Mappa dei codici identificativi dei comuni italiani
		    private static final Map<String, String> codiciComuni = new HashMap<>();
		    static 
		    {
		        codiciComuni.put("1234", "A001"); // Esempio di mappatura comune-codice
		        
		    }
		    
		   
		    
		}    
	    
}
