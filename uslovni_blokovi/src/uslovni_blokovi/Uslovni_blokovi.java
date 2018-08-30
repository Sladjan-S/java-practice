/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uslovni_blokovi;

public class Uslovni_blokovi 
{


    public static void main(String[] args)
    {
        /////OSNOVA/////
//       int x = 6;
//       int y= 7;
//       
//     if(x==6)
//     {
//     System.out.println("x is six");
//    }
//     else if(y==7)
//     {
//     System.out.println("y is seven");
//     }
//     else
//     {
//         System.out.println("The value of x is not 6 nor 7");
//     }
        //////SWITCH CASE i UGNJEZDJENI IF//////
//        double x=7;
//        double y=0;
//        
//        char operation = '/';
//        
//        switch(operation)
//        {
//            case '+':
//                System.out.printf("%.2f%n",x+y);
//                break;
//            case '-':
//                System.out.printf("%.2f%n",x-y);
//                break;
//            case '*':
//                System.err.printf("%.2f%n",x*y);
//                break;
//            case '/':
//                if(y !=0)
//                {
//                System.err.printf("%.2f%n",x/y);
//                } 
//                else
//                {
//                    System.err.println("Division by zero !!");
//                }
//                break;
//        }
        
            ///VISESTRUKI USLOVI////
//    int x = 5;
//    int y = 10;
//    int z = 15;
//    
//  if(x == 5 && y==10 && z==15)
//  {
//      System.err.println("true");
//  }
//  else
//  {
//  System.out.println("false");
//  }
        /////TERNARNI OPERATOR///
        boolean isOver = true;
        String message = (isOver == true)? "Goodbye":"Hi";
        System.err.println(message);
        
        
}
   
}