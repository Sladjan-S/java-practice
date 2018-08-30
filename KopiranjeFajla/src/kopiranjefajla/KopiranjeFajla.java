
package kopiranjefajla;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class KopiranjeFajla
{

  
    public static void main(String[] args)
    {
        File afile = new File("C:\\JavaPractice\\KopiranjeFajla\\afile.txt");
         File bfile = new File("C:\\JavaPractice\\KopiranjeFajla\\bfile.txt");
         try(FileInputStream inStream = new FileInputStream(afile);
                 FileOutputStream outStream = new FileOutputStream(bfile);)
        {
            byte[]buffer = new byte[1024];
            int length;
            while ((length =inStream.read(buffer))>0)
            {                
                outStream.write(buffer, 0, length);
            }
            System.out.println("File copied successfuly");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
    
}
