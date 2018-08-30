/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izuzetcierror;

public class IzuzetciError
{
static void checkNumber(int num)
    {
        if (num>100)
        {
            throw new TooBigNumber();
        }
    }
   
   
    public static void main(String[] args)
    {
        checkNumber(110);
    }
    
}
