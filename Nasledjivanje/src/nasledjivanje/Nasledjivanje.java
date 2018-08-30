/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasledjivanje;



public class Nasledjivanje
{

   
    public static void main(String[] args)
    {
        Person person = new Person("John", "Davidson");
        Student student = new Student("John", "Smith", "10/2017");
        Professor professor = new Professor("Edward", "Owen", "Java programming");
        
        //polimorfizam(overriding)
        person.show();
        student.show();
        professor.show();
       
        //overloading isti potpis,razliciti ulazni parametri
        double res1 = Calc.add(4, 6);
        double res2 = Calc.add(4, 6, 8);
        
        System.out.println(res1);
        System.out.println(res2);
    }
    
}
