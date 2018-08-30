
package serijalizacija;
import java.beans.*;
import java.io.*;

public class User
{
   private int Id;
   private String email;
   private String password;
   //geteri i setteri
   public void setId(int Id){this.Id = Id;}
   public int getId(){return this.Id;}
   public void setEmail(String email){this.email = email;}
   public String getEmail(){return this.email;}
   public void setPassword(String password){this.password=password;}
   public String getPassword(){return this.password;}
   
   @Override
   public String toString()
   {
   return this.Id +" "+this.email+" "+this.password;
   }
   
   public void serializeXML(String xmlFile) throws FileNotFoundException
   {
   FileOutputStream fos = new FileOutputStream(xmlFile);
   XMLEncoder s= new XMLEncoder(fos);
   s.writeObject(this);
   s.close();
   }
   
   public static User deserializeXML(String file) throws FileNotFoundException
   {
   FileInputStream fis = new FileInputStream(file);
   XMLDecoder objIn = new XMLDecoder(fis);
   User u = (User)objIn.readObject();
   return u;
   }
}
