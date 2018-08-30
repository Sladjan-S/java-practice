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
public class Freshman extends Student
{
    @Override
    public void show()
    {
        System.out.println("Freshman: "+firstName+" "+lastName+",ID No. "+indexNumber);
    }
}
