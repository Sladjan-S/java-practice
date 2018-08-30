
package arm;

import java.io.FileOutputStream;
import java.io.IOException;


public class ARM//automatic resource management
{


    public static void main(String[] args)
    {
        
       String myText = "Hello World";
        FileOutputStream fs = null;
        //pre-ARM(Java 7)
        try
        {
            fs = new FileOutputStream("myFile.txt");
            fs.write(myText.getBytes());
        }
        catch (IOException exc)
        {
            System.out.println(exc);
        }
        finally
        {
            try//pre-Java 7
            {
                if (fs !=null)
                {
                  fs.close();
                }
            }
            catch (IOException ex)
            {
                System.out.println(ex);
            }
        }
    }
    
}
