
package excvezbauser;


public class ExcVezbaUser
{

  
    public static void main(String[] args)
    {
        try
        {
            User u = new User(10,"Petar","Petrovic","petrov@mail.m");
        }
        catch (InvalidIdException e)
        {
            System.out.println("Nepravilan ID");
        }
        catch(InvalidFirstNameException e)
        {
            System.out.println("Nepravilno Ime");
        }
        catch(InvalidLastNameException e)
        {
            System.out.println("Nepravilno prezime");
        }
        catch(InvalidEmailException e)
        {
            System.out.println("Nepravilan email");
        }
    }
    
}
