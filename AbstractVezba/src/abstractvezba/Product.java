/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractvezba;


/**
 *
 * @author TheRedBaron
 */
abstract class Product
{
 public int type;
 String name;
 double price;
 public String[] additions;
 
 public abstract double countPrice();
 
 public String allAdditions()
 {
 StringBuilder s = new StringBuilder();
 for(String addition: this.additions)
 {
  if (addition != null)
  {
   s.append(addition+", ");
  }
        
 }
    
     
     if (!s.toString().equals(""))
     {
         if (s.toString().trim().endsWith(","))
         {
             s.replace(s.length()-2, s.length(), "");
         }else{
         s.append("bez dodataka.");
         }
     }
return s.toString();
 }
 
 public void addition(String addition)
 {
     for (int i = 0; i < this.additions.length; i++)
     {
         if (this.additions[i]==null)
         {
             this.additions[i]=addition;
             break;
         }
     }
 }
 
 @Override
 public String toString()
 {
 StringBuilder output = new StringBuilder();
 output.append("Proizvod: ");
 output.append(this.name+", ");
 output.append("cena: "+countPrice()+", ");
 output.append("dodaci: "+allAdditions());
 
 return output.toString();
 }
 
 
 
}
