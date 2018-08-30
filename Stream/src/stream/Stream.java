
package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Stream//byte
{

    
    public static void main(String[] args)
    {
        String myText = "Hello World";
        try(FileOutputStream fs = new FileOutputStream("myFile.txt");)
        {
           fs.write(myText.getBytes());
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        
        try(FileInputStream fs = new FileInputStream("myFile.txt");)
        {
            int content = fs.read();
            while (content !=-1)
            {                
                System.out.print((char)content);
                content = fs.read();
            }
        }
        catch (IOException exc)
        {
            System.out.println(exc);
        }
    }
    
}
