
package serijalizacija;
import java.io.FileNotFoundException;


public class Serijalizacija
{

 
    public static void main(String[] args) throws FileNotFoundException
    {
       User u = new User();
       u.setId(5);
       u.setEmail("mail@mail.ml");
       u.setPassword("123");
       u.serializeXML("myXml.xml");
       
       u=User.deserializeXML("myXml.xml");
        System.out.println(u);
    }
    
}
