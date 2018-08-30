/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsvezba;


public class EnumsVezba
{
//enumeracija je skup konstanti
    //kljucna rec enum
  
    public static void main(String[] args)
    {
        Server s = new Server("serverId=25&serverName=my name&serverStatus=Stopped");
        
        System.out.println(s);
    }
    
}
