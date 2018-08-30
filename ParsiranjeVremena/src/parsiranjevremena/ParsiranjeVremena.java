/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsiranjevremena;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author TheRedBaron
 */
public class ParsiranjeVremena
{

  
    public static void main(String[] args)
    {
//        String in = "19880505";
//        
//        LocalDate date = LocalDate.parse(in,DateTimeFormatter.BASIC_ISO_DATE);
//        
//        System.out.println(date);
        
        String inString = "05 05 1988";
        try
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MM yyyy");
            
            LocalDate date = LocalDate.parse(inString,formatter);
            System.out.println(date.format(formatter2));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
