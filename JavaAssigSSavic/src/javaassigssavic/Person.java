
package javaassigssavic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class Person
{
 
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public String birthPlace;
    
    public Person(String firstName,String lastName,LocalDate birthDate,String birthPlace)
    {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.birthPlace = birthPlace;
    }
   
    @Override
    public String toString()
    {
    return "Ime: "+firstName+"\nPrezime: "+lastName+"\nDatum rodjenja: "+birthDate.format(DateTimeFormatter.ofPattern("dd. MMM yyyy."))+"\nMjesto rodjenja: "+birthPlace+"\n\n";
    }
    
}
