package kontrolatokanizovi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KontrolaTokaNizovi
{




    public static void main(String[] args)
    {
        //deklaracija
        int[]array = {12,23,-22,0,43,545,-4,-55,43,12,0,-999,-87};
        Arrays.sort(array);
        
        //velicine novih nizova
        int pozCount = 0;
        int negCount = 0;
         
        for (int i : array)
        {
            if (i>0)
            {
                pozCount++;
            }else if (i<0)
            {
                negCount++;
            }
        }
        //novi nizovi velicine vrijednosti brojaca
       int[] posArray = new int[pozCount]; 
       int[]negArray = new int[negCount];
       
       //smjestanje brojeva u nizove
       int pozBrojevi= 0;
       int negBrojevi = 0;
       
        for (int j : array)
        {
            if (j>0)
            {
                posArray[pozBrojevi]=j;
                pozBrojevi++;
            }
            else if(j<0)
            {
                negArray[negBrojevi]=j;
                negBrojevi++;
            }
 
        }
        
        
  
        
        
        Arrays.sort(posArray);
        System.out.println("Niz pozitivnih brojeva: "+Arrays.toString(posArray));
        Arrays.sort(negArray);
        System.out.println("Niz negativnih brojeva: "+Arrays.toString(negArray));
 
        //duplikati
        //pretraga niza.Smjestanje svih unikatnih brojeva u map.
        //U slucaju duplikata key povecava se value
          HashMap<Integer,Integer> duplikati = new HashMap<>();
          
          for (int i = 0; i < array.length; i++)
        {
            int element = array[i];
            
            if (duplikati.containsKey(element))
            {
                duplikati.put(element, duplikati.get(element)+1);
            }
            else
            {
            duplikati.put(element, 1);
            }
        }
       //ispis duplikata
     
        for (Map.Entry<Integer, Integer> entry : duplikati.entrySet())
        {
            if (entry.getValue()>1)
            {
                System.out.println("Broj "+entry.getKey()+" se ponavlja "+entry.getValue());
            }
            
        }
    }
    
}
