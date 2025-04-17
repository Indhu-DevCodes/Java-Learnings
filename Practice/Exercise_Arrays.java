package Practice;

import java.util.Arrays;

public class Exercise_Arrays {

    public static void main(String[] args) {
        
        int arr1D[] = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr1D));
        System.out.println(arr1D[0]);

        arr1D = new int[]{3,4,5,6,7};

        // System.out.println(Arrays.compare(arr1D, {1,2,3,4,5}));  // error

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.compare(arr1D, arr));

   
        System.out.println(Arrays.copyOf(arr1D, 6));

    }
    
}
