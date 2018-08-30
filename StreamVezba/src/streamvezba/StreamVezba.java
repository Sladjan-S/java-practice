
package streamvezba;
import java.io.*;


public class StreamVezba
{

    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("users.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
        String[] user = line.split("\\|");
            System.out.println("Id: "+user[0].split("\\:")[1]);
             System.out.println("First name: "+user[1].split("\\:")[1]);
              System.out.println("Last name: "+user[2].split("\\:")[1]);
               System.out.println("S:S.Number: "+user[3].split("\\:")[1]);
                System.out.println("--------------------------------------");
        }
        br.close();
    }
    
}
