/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclanoviklase;

/**
 *
 * @author TheRedBaron
 */
public class Conversions
{
    static double c2f(double degrees)
    {
    return degrees*9.0/0.5+32;
    }
    
    static double f2c(double degrees)
    {
    return (degrees-32)*5.0/9.0;
    }
}
