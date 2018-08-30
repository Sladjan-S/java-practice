/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;


public class BubbleSort
{
    
public static void printArray(int []a)
{
    System.out.print("Your array: ");
    for (int k = 0; k < a.length; ++k)
    {
        System.out.printf(" %d ", a[k]);
    }
    System.out.println();
}

public static void bubbleSort(int []a)
{
    int temp;
    for (int i = 0; i < a.length-1; i++)
    {
        for (int j = 0; j < a.length-i-1; j++)
    {
        if (a[j]>a[j+1])
        {
            temp = a[j];
            a[j]= a[j+1];
            a[j+1] = temp;
        }
 
    }  
    }
  
}
  
    public static void main(String[] args)
    {
        //retko se koristi jer je vrlo spor
        int[]a = {9,5,3,1,7,6,4};
        bubbleSort(a);
        printArray(a);
    }
    
}
