
package fajlovicitanje;

import java.io.File;


public class FajloviCitanje
{

   
    public static void main(String[] args)
    {
      File path = new File("C:\\JavaPractice\\FajloviCitanje");
//        if (path.exists()&&path.isDirectory())
//        {
//            String[]strings = path.list();
//            for (int i = 0; i < strings.length; i++)
//            {
//                System.out.println(strings[i]);
//            }
//        }
//ili jos bolje,objekti
if (path.exists()&&path.isDirectory())
        {
            File[]files = path.listFiles();
            for (int i = 0; i < files.length; i++)
            {
                System.out.println(files[i].getName());
            }
        }
    }
    
}
