/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasledjivanje;


public class Person
{
    public String firstName;
    public String lastName;
    public final String SCHOOL_NAME = "ITAcademy";
    
    public Person(String firstName, String lastName)
    {
    this.firstName = firstName;
    this.lastName = lastName;
    }
    
    public void show()
    {
        System.out.println("Person: "+firstName+" "+lastName);
    }
    
}
