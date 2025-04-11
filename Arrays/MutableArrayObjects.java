package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MutableArrayObjects {

    //Arrays are mutable in Java - Mutable means you can change the objects
    //Strings are immutable in Java
    //here num & arr variables are pointing to same object in memory
    public static void main(String[] args) {
     //arrays of objects
        Scanner in = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
             str[i] = in.next();
         }     
        System.out.println(Arrays.toString(str));
     
        // Array modify
        str[1] = "induu";  // changing the orginal object
        System.out.println(Arrays.toString(str));

        
        int[] num = {3,15,23,6,2};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    public static void change(int[] arr){
        arr[0]=99;      
        System.out.println(Arrays.toString(arr));
    }

    
}