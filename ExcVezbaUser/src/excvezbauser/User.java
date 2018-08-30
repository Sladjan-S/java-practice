/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excvezbauser;

class InvalidIdException extends Exception{}
class InvalidFirstNameException extends Exception{}
class InvalidLastNameException extends Exception{}
class InvalidEmailException extends Exception{}

public class User
{
    public int id;
    public String firstName;
    public String lastname;
    public String email;
    
    public User(int id,String firstname,String lastname,String email)
             throws InvalidIdException,InvalidFirstNameException,InvalidLastNameException,
        InvalidEmailException
    {
        if (id>100) {
            throw new InvalidIdException();
        } else
        {
            this.id = id;
        }
        if (firstname.equals("")) {
            throw new InvalidFirstNameException();
        } else
        {
            this.firstName = firstname;
        }
        if(lastname.equals("")) {
            throw new InvalidLastNameException();
        } else
        {
            this.lastname = lastname;
        }
        if(email.equals("")) {
            throw new InvalidEmailException();
        } else
        {
            this.email = email;
        }
   
    }
}
