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
public class AbstractVezba
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Pizza p = new Pizza("Kapricoza", 125);
       p.addition("paradajz");
       p.addition("pavlaka");
       
       Sandwich s = new Sandwich("Sendvic sa sunkom", 35);
       s.addition("krastavac");
       s.addition("luk");
       s.addition("paradajz");
       
       
        System.out.println(p);
        System.out.println(s);
    }
    
}
