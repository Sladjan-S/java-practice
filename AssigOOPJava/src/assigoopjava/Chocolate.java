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
public class Chocolate extends Product
{
    public int weight;
    
    public Chocolate(String name,double price,int barcode,int weight)
    {
    this.name = name;
    this.price=price; 
    this.barcode = barcode;
    this.weight = weight;
    }
    
    @Override
    public double price()
    {
    return this.price * 1.2;
    }
    
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
   s.append("Cokolada: ");
   s.append(this.name+", ");
   s.append("\nbar kod: ");
   s.append(barcode);
   s.append("\ntezine: ");
   s.append(weight+" grama, ");
   s.append("\nosnovna cijena: ");
   s.append(this.price+", ");  
   s.append("\nUKUPNO: ");
   s.append(price()+"\n\n");
   
   
   return s.toString();
   
    }
    
    
    
}
