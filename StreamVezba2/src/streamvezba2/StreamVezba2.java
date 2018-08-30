
package streamvezba2;
import java.io.*;
import java.util.ArrayList;

public class StreamVezba2
{

   
    public static void main(String[] args) throws IOException
    {
        //prvo resenje
//       String tmpline;
//       BufferedWriter bw = new BufferedWriter(new FileWriter("treciFajl.txt"));
//       
//       BufferedReader br = new BufferedReader(new FileReader("prviFajl.txt"));
//       while((tmpline=br.readLine())!=null)
//              bw.write(tmpline+"\n");
//       br.close();
//
//        br = new BufferedReader(new FileReader("drugiFajl.txt"));
//           while ((tmpline=br.readLine())!=null)            
//                    bw.write(tmpline+"\n");
//        br.close();
//               
//        bw.close();
     
        ///drugo resenje
        String tmpLine;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("treciFajl.txt")))
        {
            ArrayList<BufferedReader>filesToRead = new ArrayList<>();
            filesToRead.add(new BufferedReader(new FileReader("prviFajl.txt")));
             filesToRead.add(new BufferedReader(new FileReader("drugiFajl.txt")));
            for (BufferedReader br : filesToRead)
            {
                while ((tmpLine = br.readLine())!=null)
                {
                    bw.write(tmpLine+"\n");
                }
                br.close();
              
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
           
    }
    
}
