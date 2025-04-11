package Arrays;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {

        /*
                1 2 6
                4 7 2
                6 4 1

                3 rows & 3 columns
        */

        //one dimension array is defined with one [], like int[]
        //two dimension array is defined with 2 [][], like int[][] ... so on

        /* 2D array
                int[][] arr = new int[rows][columns];

                in heap memory, it will store like this..
                [[][][][]] - 2D
                [[[]][[]][[]]] - 3D
                 
                [
                [1,24,6] -> index- 0
                [5,3,8] -> index- 1
                [5,3,1] -> index- 2
                ]

        */

//        int[][] arr = new int[3][];        //int[rows][columns] - columns is not necessary to specify. it's not mandatory

       int[][] arr2D = {
               {1,2,4},    //0th index
               {5,7},    //1th index
               {8,3,1,5,8}    //2th index   // each and every array of row can have a different size that the reason column size is not required to specify.
       };

       // Inside a array have a different size of an elements called Jagged array
       // for example, if we call arr2D[2][1] = 8, or arr2D[2] = {8,3,1}

       for (int row = 0; row < arr2D.length; row++) {
        for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
        }
        System.out.println();
       }

       jaggedArrWithRondomNumbers();
        
    }

    
    static void jaggedArrWithRondomNumbers(){
        int[][] arr2D = new int[3][];
        arr2D[0] = new int[5];   // initializing a element size for each row of array
        arr2D[1] = new int[3]; 
        arr2D[2] = new int[6]; 

        for (int row = 0; row < arr2D.length; row++) {
               for (int col = 0; col < arr2D[row].length; col++) {
                        arr2D[row][col] = (int)(Math.random() * 10);  //random is gives you double value so casting this to int and multiplying that double value with 10
               } 
        }

        for (int[] nums : arr2D) {
                System.out.println(Arrays.toString(nums));
        }

    }
}

/* Drawback of array:
-- if we say new keyword it create object in heap 
-- Array need continuous memory allocation (which means occupy a space continuously in memory)
-- Once you create array you cannot increase or decrease size in current array
-- for insertion and searching in array performance is low as compare 
hashset, linkedhashset, linkedlist are from collection this where you understand why we need other data structure to store element.
-- only homogenous data allowed in array e.g if data is int type then you cannot add string , float and other data type in it.
-- collection is only solution for this

 */