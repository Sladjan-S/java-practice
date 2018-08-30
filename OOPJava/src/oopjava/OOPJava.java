
package oopjava;


public class OOPJava
{

    abstract class Animal
    {
    
    }
    public class Horse extends Animal
    {
    
    }
    public class Dog extends Animal
    {
    
    }
   
     Horse horse = new Horse();
        Dog dog = new Dog();
    public static void main(String[] args)
    {
       Cookie cookie;//promjenljiva tipa cookie(pripada klasi kuki :D)
       
       cookie = new Cookie();
      Cookie cookie2 = new Cookie();
      
      cookie.bake();
      
        System.out.println(cookie);//ili cookie.toString();
      
    }
    
}
