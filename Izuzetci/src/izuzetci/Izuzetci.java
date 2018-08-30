
package izuzetci;


public class Izuzetci
{

  
    public static void main(String[] args)
    {
        int[]nums = new int[4];
        try
        {
            nums[7]=10;
            double variable = 5/0; 
        }//prije koristenja Exception generalne klase probati specijalizovane
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
        {//hvatanje visetrukih exc u catch bloku sa | operatorom(ili)
            System.out.println(e);
        }
        catch(Exception e)//generalni uzorak na kraju
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Leaving try-catch..");
        }
    }
    
}
