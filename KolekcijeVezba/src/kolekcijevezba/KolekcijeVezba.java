/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcijevezba;

////POZADINSKA LOGIKA RUCNO NAPRAVLJENE LISTE///////
///treba implementirati interfejs List
public class KolekcijeVezba
{

  
    public static void main(String[] args)
    {
        NodeList list = new NodeList();
        list.add(1);
        list.add(5);
        list.add(10);
        
        System.out.println(list.getValue(2));
    }
    
}
