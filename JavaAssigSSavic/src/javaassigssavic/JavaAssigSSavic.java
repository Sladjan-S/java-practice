
package javaassigssavic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class JavaAssigSSavic
{

 
    public static void main(String[] args)
    {
       String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
       
        ArrayList lista = new ArrayList();
        
        String[] osobe = text.split("[ ./]");
        
         
    
        for (int i = 0; i < osobe.length; i+=4)
        {
           String firstName = osobe[i];   
           String lastName = osobe[i+1];
           
           String in =osobe[i+2];
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
           LocalDate birthDate = LocalDate.parse(in, dtf);
           
           String birthPlace = osobe[i+3];
          
          Person p = new Person(firstName, lastName, birthDate,birthPlace);
          lista.add(p);
            
          System.out.println(p.toString());
        }
   
    }
    
}
