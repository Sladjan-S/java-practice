/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigoopjava;


public abstract class Product
{
   public String name;
   public int barcode;
   public double price;

   public abstract double price();
   
   @Override
   public String toString()
   {
   StringBuilder s = new StringBuilder();
   s.append("Proizvod: ");
   s.append(this.name+", ");
   s.append("bar kod: ");
   s.append(barcode);
   s.append(",osnovna cijena: ");
   s.append(price+", ");
   
   
   return s.toString();
   }
}
