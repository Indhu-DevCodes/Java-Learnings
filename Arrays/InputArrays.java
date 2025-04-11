package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // input using forloops
        for(int i=0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(arr));  // print elements as an Array

        // for (int num : arr) {   // for every element in array, print the element
        //     System.out.println(num + " ");  // here num represents element of the array
        // }

        // System.out.println(arr[5]);  // index out of bound exception

    }
}
