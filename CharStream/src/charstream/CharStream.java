/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharStream
{

    
    public static void main(String[] args)
    {
        
        
     String myString = "Hello World";
     //pisanje
        try(FileWriter fw = new FileWriter("myFile.txt");)
        {
         fw.write(myString);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        //citanje
//        try(FileReader fr = new FileReader("myFile.txt");)
//        {
//            int c;
//            while ((c = fr.read()) !=-1)
//            {                
//                System.out.println((char)c);//mora se kastovati inace dobijamo UNICODE
//            }
//        }
//        catch (IOException e)
//        {
//            System.out.println(e);
//        }
//        finally
//        {
//            System.out.println();
//        }
//citanje po liniju umjesto po karakter,efikasnije i cesce korisceno NAUCITI!!!
          try(BufferedReader br = new BufferedReader(new FileReader("myFile.txt")))
        {
            String line;
            while ((line = br.readLine()) !=null)
            {                
                System.out.println(line); 
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
    
}
