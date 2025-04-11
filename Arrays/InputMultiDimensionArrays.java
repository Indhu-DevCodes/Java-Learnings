package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputMultiDimensionArrays {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];    
        System.out.println(arr.length);  //no of rows

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {  // arr[0].length - this can have multi values(column), here 0 refers row 
                arr[row][col] = scanner.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // System.out.println("-----------------------");

        //output as array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        
        // enhanced for loop 
        // for (int[] a : arr) {
        //     System.out.println(Arrays.toString(a));
        // }

    }
}
