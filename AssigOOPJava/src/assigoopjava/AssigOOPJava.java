/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigoopjava;


public class AssigOOPJava
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Chocolate c = new Chocolate("Boissier Limited Edition", 100,123456, 80);
        System.out.println(c);
        
        Wine w = new Wine("Cabernet Sauvignon", 99730,7890123, 0.75);
        System.out.println(w);
    }
    
}
