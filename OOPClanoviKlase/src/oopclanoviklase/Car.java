/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclanoviklase;

/**
 *
 * @author TheRedBaron
 */
public class Car
{
    String make;
    String model;
    int numDoors;
    static int wheels = 4;//ne mora se instancirati klasa da se pristupi polju
    
    //konstuktori

//    public Car()//bez parametara
//    {
//        System.out.println("Car created");
//    }
//
//    public Car(String filename)//sa parametrima
//    {
//        System.out.println(filename+" created.");
//    }

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
       
    }

    public Car(String make, String model, int nDoors)
    {
        this.make = make;
        this.model = model;
        numDoors = nDoors;
        /*kada se parametar konstruktora ne zove isto kao polje klase, ne treba pisati this*/
    }
    
    //metode
    void printdetails()
    {
        System.out.println("Make "+make);
        System.out.println("Model "+model);
        System.out.println("Number of doors "+numDoors);
    }
    
    
    
    
    
    
}
