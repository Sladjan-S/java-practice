
package fajlovi;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class Fajlovi
{

   
    public static void main(String[] args)
    {
        //listanje root direktorijuma
//       File[]roots = File.listRoots();
//        for (int i = 0; i < roots.length; i++)
//        {
//            System.out.println(roots[i]); //ispisuje C:\ i D:\ itd
//        }
        //ispis putanje,imena,roditeljskog foldera itd
//        File fileAbs = new File("C:\\Users\\Axilen\\Downloads\\test.png");
//        System.out.println("Absolute path: "+fileAbs.getAbsolutePath());
//        System.out.println("Name = "+fileAbs.getName());
//        System.out.println("Parent = "+fileAbs.getParent());
//        System.out.println("Path = "+fileAbs.getPath());
//        System.out.println("Is absolute = "+fileAbs.isAbsolute());
        
        File file = new File("C:\\Users\\Axilen\\Downloads\\test.png");
        if (file.exists())
        {//ispis da li je fajl,directory,duzina,zadnja mod. itd
            System.out.println("Is file: "+file.isFile());
            System.out.println("Is directory: "+file.isDirectory());
            System.out.println("Length: "+file.length());
            
            Instant instant = Instant.ofEpochMilli(file.lastModified());
            LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
             DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd. MMMM yyyy. HH:mm:ss");
             System.out.println("Last modified: "+dateTime.format(dateTimeFormatter));
             file.setReadOnly();
        }
    }
    
}
