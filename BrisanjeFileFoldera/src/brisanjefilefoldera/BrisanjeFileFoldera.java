
package brisanjefilefoldera;

import java.io.*;


public class BrisanjeFileFoldera
{

 
    public static void main(String[] args)
    {
       File file = new File("C:\\test");
        if (file.exists())
        {
            file.delete();
            System.out.println("File deleted!");
        }
        else{
            System.out.println("Can not delete:"+file.getName()+", it does not exist");
        }
    }
    
}
