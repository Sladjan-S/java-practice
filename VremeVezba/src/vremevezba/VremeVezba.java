
package vremevezba;

import java.time.LocalDate;
import java.time.Month;

public class VremeVezba
{

 
    public static void main(String[] args)
    {
        LocalDate now = LocalDate.now();
        
        for (Month month : Month.values())
        {
            System.out.println(month+" "+month.length(now.isLeapYear()));  
        }
    }
    
}
