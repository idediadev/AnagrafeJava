/*
 *@author Taddia Davide 
 * 
 *@version 0.1
 * 
 */

package cittadino;
import java.time.LocalDate;
import java.util.Scanner; 

public class Persona {

private String nameSurname;
   //passaggio parametri per prova da DIY drill 
    private int yearofBirth;
    private LocalDate dataNascita;
    
   

    // Costruttors
      //persona DIY drill 
    public Persona(String nameSurname, int yearofBirth) //pass datea for main use,per creare istanza di persona 
    {
        this.nameSurname = nameSurname;
        this.yearofBirth = yearofBirth;
        this.dataNascita = LocalDate.of(yearofBirth, 1, 1); //this.LocalData deve assumere per forza un valore di tipo LocalData
    }
    
      //Persona Real
      public Persona(String nameSurname, String dateofBirthString)
      { 
         this.nameSurname = nameSurname;
         this.dataNascita = LocalDate.parse(dateofBirthString); 
      }

   

    // Getters
    public String getNomeCognome() 
    {
        return nameSurname;
    }

    public int getAnnoNascita() 
    {
        return yearofBirth;
    }

    public LocalDate getDataNascita() 
    {
        return dataNascita;  // un getter di tipo LocalDate deve far ritornare per forza un valore di tipo LocalDate 
                              //  appartenente alla classe stessa, vedi "private LocalDate dataNascita"
    } 
      
    
    
       
  
    // issue 01: Omonimia
    public boolean omonimo(Persona p)
    {
        return this.nameSurname.equals(p.nameSurname);
    }

    // Calcolo dell'età
    public int isOlderThan(Persona other) 
    {
        return this.yearofBirth - other.yearofBirth;
    }
    //Calcolo accurato dell'età

    // Builder per la raccolta di Davide Taddia 
    public String toString() 
    {
        return "Nome e cognome: " + nameSurname + "\nAnno di nascita: " + yearofBirth;
        //return "Nome e cognome: " + nameSurname + "\nData di nascita: " + dateofBirth;
    }
}
   
   


