/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasledjivanje;

/**
 *
 * @author TheRedBaron
 */
public class Student extends Person
{
    public String indexNumber;
    
    public Student(String firstName,String lastName,String indexNumber)
    {
    super(firstName, lastName); /*poziv konstruktora roditeljske klase*/
    this.indexNumber=indexNumber;
    }
    
    @Override
    public void show()
    {
        System.out.println("Student "+firstName+" "+lastName+" ID No. "+indexNumber);
    }
    
}
