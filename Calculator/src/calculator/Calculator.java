/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author TheRedBaron
 */
public class Calculator
{

    public double operand1;
    public double operand2;
    public char operator;
    
    public double calculate()        
    {
    double result;
    switch(this.operator)
    {
    case'+':
        result = operand1+operand2;
        break;
        case'-':
            result = operand1-operand2;
            break;
            case'*':
                result=operand1*operand2;
                break;
                case'/':
                    if (operand2==0)
                    {
                        System.out.println("Deljenje nije moguce"); 
                    }else{
                      result = operand1/operand2;
                    break;
                    }
                  
                    default:
                    result=0;
                    break;
    }
    return result;
    }
   
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        c.operand1 = 2;
        c.operand2 = 5;
        c.operator= '+';
        System.out.println(c.calculate());
    }
    
}
