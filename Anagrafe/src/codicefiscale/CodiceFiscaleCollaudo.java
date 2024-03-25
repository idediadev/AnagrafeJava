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

public class CodiceFiscaleCollaudo {

	 public static CheckBDay()
	 {
      String dataCodificata = estraiDataNascita(bday);
      System.out.println("Data di nascita codificata: " + dataCodificata);
	 }
	 
	 public static String estraiCodiceComune(String codiceFiscale) 
	    {
	        // Prendi gli ultimi 4 caratteri del codice fiscale (escludendo il carattere di controllo)
	        String ultimeQuattroCifre = codiceFiscale.substring(codiceFiscale.length() - 5, codiceFiscale.length() - 1);
	        
	        // Cerca il codice del comune nella mappa
	        String codiceComune = codiciComuni.get(ultimeQuattroCifre);
	        
	        return codiceComune != null ? codiceComune : "CODICE NON TROVATO"; // Restituisce "CODICE NON TROVATO" se non viene trovato il codice del comune
	    }
}
