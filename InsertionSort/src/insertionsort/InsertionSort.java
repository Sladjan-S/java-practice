
package insertionsort;


public class InsertionSort
{
public static void printArray(int []a)
{
    System.out.print("Your array: ");
    for (int k = 0; k < a.length; k++)
    {
        System.out.printf(" %d ",a[k]);
    }
    System.out.println();
}

public static void insertionSort(int []a)
{
int current,temp;
    for (int i = 1; i < a.length; ++i)
    {
        current = i;
        while (current>0 && a[current-1]>a[current])
        {            
            temp = a[current];
            a[current]=a[current-1];
            a[current-1]= temp;
            current--;
        }
    }
}
  
    public static void main(String[] args)
    {
       int[]a = {9,5,3,1,7,6,4};
       insertionSort(a);
        printArray(a);
    }
    
}
