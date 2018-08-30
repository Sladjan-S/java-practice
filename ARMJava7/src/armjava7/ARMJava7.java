
package armjava7;

import java.io.FileOutputStream;
import java.io.IOException;


public class ARMJava7
{

 
    public static void main(String[] args)
    {
        String myText = "Hello World from ARM and FileOutputStream class";
        /*dodaju se zagrade sa resursom kod try bloka.Nakon napustanja istog,
        resurs se automatski oslobadja*/
        try(FileOutputStream fs = new FileOutputStream("myFile.txt"))
        {
            fs.write(myText.getBytes());
        }
        catch (IOException exc)
        {
            System.out.println(exc);
        }
    }
    
}
