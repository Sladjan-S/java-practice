
package oopclanoviklase;


public class OOPClanoviKlase
{


    public static void main(String[] args)
    {
        System.out.println(Car.wheels);
        
//        Car car1 = new Car();
//        Car car2 = new Car("Ford");
        
        Car car3 = new Car("Ford", "Fiesta");
        Car car4 = new Car("Honda", "Civic", 3);
        
        car3.printdetails();
        car4.printdetails();
        
        
        Conversions.c2f(33);
    }
    
}
