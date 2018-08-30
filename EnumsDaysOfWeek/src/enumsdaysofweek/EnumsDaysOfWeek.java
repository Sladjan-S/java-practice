/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsdaysofweek;

/**
 *
 * @author TheRedBaron
 */
public class EnumsDaysOfWeek
{

  public enum DaysOfWeek
  {
  MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
  
  public int position;
  
  //konstruktor enumeracije
DaysOfWeek(int i)
{
this.position = i;
}
  
  }
  
  
  
    public static void main(String[] args)
    {
        System.out.println(DaysOfWeek.WEDNESDAY.position);
        
        for (int i = 0; i < DaysOfWeek.values().length; i++)
        {
            System.out.println(DaysOfWeek.values()[i]);
        }
        
    }
    
}
