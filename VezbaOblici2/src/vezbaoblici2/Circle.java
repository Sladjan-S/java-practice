/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezbaoblici2;

/**
 *
 * @author TheRedBaron
 */
public class Circle extends Shape
{
    public final double PI=3.14;
    public double r;
    
    public double area()
    {
    return r*r*PI;
    }
}
