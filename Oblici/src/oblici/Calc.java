/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oblici;

/**
 *
 * @author TheRedBaron
 */
public class Calc
{
    public static double area(Object shape)
    {
        if (shape.getClass()==Circle.class)
        {
           return Math.pow(((Circle)shape).r, 2)*Math.PI;
        }
        if (shape.getClass()==Rectangle.class)
        {
            return ((Rectangle)shape).a*((Rectangle)shape).b;
        }
        return 0;
    }
}
