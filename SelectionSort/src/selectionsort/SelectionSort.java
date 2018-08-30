
package selectionsort;

public class SelectionSort
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
 
public static void selectionSort(int []a)
{
int min,temp;
    for (int i = 0; i < a.length; i++)
    {
min = i;
    for (int j = i+1; j < a.length; ++j)
    {
        if (a[min]>a[j])
        {
            min = j;
        } 
    }
    temp = a[min];
    a[min]= a[i];
    a[i]= temp;
    }
}
    public static void main(String[] args)
    {
       int[]a = {9,5,3,1,7,6,4};
       selectionSort(a);
        printArray(a);
    }
    
}
