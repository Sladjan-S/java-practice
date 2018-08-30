/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upravljanjevremenom;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author TheRedBaron
 */
public class UpravljanjeVremenom
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       // System.out.println(LocalDate.now());
        LocalDate now = LocalDate.now();
        
        System.out.println(now);
        
        System.out.println(now.getYear());
        
        LocalTime time = LocalTime.now();
        System.out.println("Hour: "+time.getHour()+" min: "+time.getMinute()+" sec: "+time.getSecond());
        
        Instant instant = Instant.now();
        System.out.println(instant.toString());
        
        
        long period = instant.until(Instant.now(), ChronoUnit.SECONDS);
        System.out.println(period);
    }
    
}
