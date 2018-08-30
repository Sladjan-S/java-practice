
package kreiranjefoldera;

import java.io.File;


public class KreiranjeFoldera
{

  
    public static void main(String[] args)
    {
        File testDirectory = new File("C:\\test");
        try
        {
            if (!testDirectory.exists())
            {
                testDirectory.mkdir();
                System.out.println("Created directory: "+testDirectory.getName());
            }
            else{
                System.out.println("Directory: "+testDirectory.getName()+"already exists");
            }
        }
        catch (Exception e)
        {
            System.out.println("Could not create dir: "+testDirectory.getName());
        }
    }
    
}
