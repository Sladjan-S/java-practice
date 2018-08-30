/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petlje;



/**
 *
 * @author TheRedBaron
 */
public class Petlje
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        int[]array = {3,5,1,7,9,11,0};
//        
//      
//        for(int i=0; i<array.length; i++)
//        {
//            System.out.println(i+1 + ".element of array is "+ array[i]);
//        }
//        int[][] matrix = 
//        {
//            {1,2,3,4,5},
//            {6,7,8,9,10}
//        };
//        for (int i = 0; i < matrix.length; i++)
//        {
//            for (int j = 0; j < matrix[i].length; j++)
//            {
//                System.out.println(matrix[i][j]);
//            }
//        }
        
        //FOREACH
            int[] array = {1,2,3,4,5};
            
//            for (int val:array)
//        {
//            System.out.println(val);
//        }
/////PRESKAKANJE 
        for (int i = 0; i < array.length; i++)
        {
            if (i==2)
            {
                continue;
            }
            System.out.println(array[i]);
        }
    }
  
   
}
