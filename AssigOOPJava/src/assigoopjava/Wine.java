/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigoopjava;

/**
 *
 * @author TheRedBaron
 */
public class Wine extends Product
{
   public double volume;
   
   public Wine(String name,double price,int barcode,double volume)
   {
   this.name = name;
    this.price=price; 
    this.barcode = barcode;
    this.volume = volume;
   }
   
   @Override
   public double price()
   {
   return (this.price * 1.2) * 1.1;
   }
   
   @Override
   public String toString()
   {
       StringBuilder s = new StringBuilder();
   s.append("Vino: ");
   s.append(this.name+", ");
    s.append("\nbar kod: ");
   s.append(barcode);
   s.append("\nzapremine: ");
   s.append(volume+" litara, ");
   s.append("\nosnovna cijena: ");
   s.append(this.price+", ");  
   s.append("\nUKUPNO: ");
   s.append(price()+"\n\n");
   return s.toString();
   }
   
   
}
