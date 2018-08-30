
package promenanazivaff;

import java.io.*;


public class PromenaNazivaFF
{

  
    public static void main(String[] args)
    {
        File oldFile = new File("C:\\JavaPractice\\PromenaNazivaFF\\oldname.txt");
        File newFile = new File("C:\\JavaPractice\\PromenaNazivaFF\\newname.txt");
        if (!oldFile.exists())
        {
            System.out.println("File does not exist");
            return;
        }
        if (newFile.exists())
        {
            System.out.println("File with selected name already exists.");
            return;
        }
        if (oldFile.renameTo(newFile))
        {
            System.out.println("Renamed file succesfully");
        }
        else
        {
            System.out.println("Renaming failed");
        }
        
    }
    
}
