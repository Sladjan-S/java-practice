/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author TheRedBaron
 */
public class AbstractClasses
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Freshman f = new Freshman();
        f.firstName = "Jane";
        f.lastName = "Doe";
        f.indexNumber = "68/2016";
        f.show();
        
        //////////////////////////////
        
        Calc c = new Calc();
        System.out.println(c.add());
    }
    
}
