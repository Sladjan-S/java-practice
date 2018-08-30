/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oblici;



public class Oblici
{

   
    public static void main(String[] args)
    {
      Circle c = new Circle(4);
        System.out.println(Calc.area(c));
        
        Rectangle r = new Rectangle(2, 3);
        System.out.println(Calc.area(r));
    }
    
}
