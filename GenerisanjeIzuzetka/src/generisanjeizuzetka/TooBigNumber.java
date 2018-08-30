/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generisanjeizuzetka;

/**
 *
 * @author TheRedBaron
 */
public class TooBigNumber extends Exception
{
   @Override
   public String toString()
   {
   return "Number too big!";
   }
   
   @Override
   public String getMessage()
   {
   return "Number too big!";
   }
}
