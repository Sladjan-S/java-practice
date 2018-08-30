/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringovivezba;

import java.util.Scanner;


public class StringoviVezba
{
    
    ///polindrom///
public static boolean palindrom(String str)
{
StringBuilder pom = new StringBuilder(str);
pom.reverse();

return str.equals(pom.toString());
}
    
    public static void main(String[] args)
    {

String users = "Ime: Vladimir|Prezime: Vladimirovic|Ime: Jovan|Prezime: Jovanovic|Ime: Petar|Prezime: Petrovic";
 
/* i "|" je specijalni karakter */
String[] usersArray = users.split("\\|");
 
for(int i=0; i<usersArray.length; i+=2)
{
        String firstName = usersArray[i].split(" ")[1];
        String lastName = usersArray[i+1].split(" ")[1];
        System.out.println("ime korisnika je : " + firstName + ", prezime korisnika je : " + lastName);
}

/////polindrom/////

Scanner s = new Scanner(System.in);
        System.out.println("Unesite string za proveru: ");
        
        if (palindrom(s.next()))
        {
            System.out.println("String je palindrom");
        }
        else
        {
            System.out.println("String nije palindrom");
        }
        s.close();


    }
    
}
