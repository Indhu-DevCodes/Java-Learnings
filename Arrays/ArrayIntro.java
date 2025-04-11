package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntro {

    public static void main(String[] args) {

        //syntax to create an array
//        datatype[] var_name = new dataType[size]
    //    int[] arr = new int[5];
      
    //    adding elements into an array
    //    arr[0] = 23;
    //    arr[1] = 3;
    //    arr[2] = 9;
    //    arr[3] = 7;
    //    arr[4] = 53;
    //    System.out.println(Arrays.toString(arr));  //print an array

//        or directly
//        int[] num = {1,2,3,45};

        int[] num;   //declaration of array. num is getting defined in the stack - This thing happends at Compiletime
        num = new int[5];   //initialization actually here object is being created in the heap memory - This thing happends at Runtime
// Runtime is basically known as Dynamic memory allocation (Memory is allocated at the runtime)


        System.out.println(num[1]);     // int default value (0)  

        String[] name = new String[3];
        // System.out.println(name[1]);    // string default value (null)  

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car: cars) {
            System.out.println(car);
        }

         int a =10;
         a= 20;
         System.out.println(a);

         String s = "indu";
         s = "gopu";
         System.out.println(s);

         int arr[] = {1,2,3,4,5};
        //  arr = {8,7,65,4,3,2,1};  // reassign is not posible! with the same object in memory 
        /* 
        arrays in Java cannot be resized, once created. If you want to reassign(resize) an array you must create a new one in memory
         because arrays are fixed size cannot be changed. example below.
        */

        arr = new int[]{7,6,5,4,3,2,1};

        List<Integer> li = Arrays.asList(23,1);
        li = Arrays.asList(1,2,3,4,5);
        System.out.println(li);

    }

}