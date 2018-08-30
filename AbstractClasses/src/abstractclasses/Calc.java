/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author TheRedBaron
 */
public class Calc implements Operations,Operands
{
    double a,b;
    @Override
    public double add()
    {
    setOperands();
    return a+b;
    }
    
    @Override
    public void setOperands()
    {
    a=2;
    b=3;
    }
    
}
