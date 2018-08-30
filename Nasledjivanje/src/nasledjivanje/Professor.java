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
public class Professor extends Person
{
   public String className;
   
   public Professor(String firstName,String lastName,String className)
   {
   super(firstName, lastName);
   this.className=className;  
   }
    @Override
   public void show()
   {
       System.out.println("Professor "+firstName+" "+lastName+" teaches "+className);
   }
}
