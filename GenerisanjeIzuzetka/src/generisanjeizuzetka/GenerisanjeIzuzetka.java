/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generisanjeizuzetka;


public class GenerisanjeIzuzetka
{

//    static void errorMethod()throws Exception
//    {
//    Exception exc = new Exception();
//    throw exc;
//    }
    
 static void checkNumber(int num)throws TooBigNumber
 {
     if (num>100)
     {
         throw new TooBigNumber();
     }
 }
    public static void main(String[] args)
    {
//       errorMethod();//izaziva gresku
        
        try
        {
            checkNumber(110);
        }
        catch (TooBigNumber ex)
        {
            System.out.println(ex);
        }
    }
    
}
