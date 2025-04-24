package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Programs_Arrays {

    public static void main(String[] args) {
        ascendingArr();
        descendingArr();
        // sumOfArrElements();
        // avgValueOfElements();
        // storeElementAndPrint();
        // userInputArr();
        // userInputSumArr();
        // reverseArr();
        printCubicArrValues();
    }

    
// 1. Write a program to Sort Numeric Array In Ascending Order

// Sample Output
// Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
// Ascending Order = {2, 3, 3, 5, 20, 23, 30, 67, 70, 79}
    private static void ascendingArr() {
        int[] array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

    }

// 2. Write a program to Sort Numeric Array In Descending Order

// Sample Output
// Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
// Descending Order = {79, 70, 67, 30, 23, 20, 5, 3, 3, 2}
    private static void descendingArr() {
       int[] array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
    }

// 3. Write a program to print sum values of an array

// Sample Output
// Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
// Sum Values of Array = 55

    private static void sumOfArrElements() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
       System.out.println(result);
    }

// 4. Write a program to calculate the average value of array elements

// Sample Output
// Array = {1, 2, 3, 4, 5}
// Sum of Array Value : 15
// Average of Array Value : 3.0
    
    private static void avgValueOfElements() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        avg = sum/arr.length;
        System.out.println("Sum of Array Value : "+sum);
        System.out.println("Average of Array Value : "+avg);
    }

// 5. Write a program to store elements in an array and print it

// Sample Output
// Array Size = 5
// Element of a[0] = 5
// Element of a[1] = 11
// Element of a[2] = 22
// Element of a[3] = 33
// Element of a[4] = 44
// Display Array Elements
// 5
// 11
// 22
// 33
// 44

private static void storeElementAndPrint() {
    int[] arr = new int[5];
    arr[0] = 5;
    arr[1] = 11;
    arr[2] = 22;
    arr[3] = 33;
    arr[4] = 44;

    for (int i : arr) {
        System.out.println(i);
    }

}

// 6. Write a program in to array size to be user input print it

// Sample Output
// Enter the Array Limit = 4
// Element of a[0] = 10
// Element of a[1] = 20
// Element of a[2] = 30
// Element of a[3] = 40

// Display Array Elements
// 10
// 20
// 30
// 40

    private static void userInputArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a array limit: ");
        int li = in.nextInt();
        int arr[] = new int[li];
        for (int i = 0; i < li; i++) {
            System.out.printf("Element of arr[%d] = ",i);
            arr[i] = in.nextInt();
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

// 7. Write a program in to find the sum of all elements of the array

// Sample Output
// Array = {10, 20, 30, 40, 50, 60}
// Sum of Array Elements = 210

    private static void userInputSumArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a array limit: ");
        int li = in.nextInt();
        int arr[] = new int[li];
        int sum = 0;
        for (int i = 0; i < li; i++) {
            System.out.printf("Element of arr[%d] = ",i);
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of Array Elements "+sum);
    }


// 8. Write a program in to read n number of values in an array and display it in reverse order

// Sample Output
// Enter the Array Size = 5
// Element of a[0] = 1
// Element of a[1] = 2
// Element of a[2] = 3
// Element of a[3] = 4
// Element of a[4] = 5

// Display Reverse Order
// 5
// 4
// 3
// 2
// 1

private static void reverseArr() {
    System.out.print("enter the array size: ");
    Scanner in = new Scanner(System.in);
    int arrSize = in.nextInt();
    int[] arr = new int[arrSize];
    for (int i = 0; i < arr.length; i++) {
        System.out.printf("element of arr[%d] = ",i);        
        arr[i] = in.nextInt();
    }

    int start = 0;
    int end = arrSize - 1;
    int temp;
    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    System.out.println(Arrays.toString(arr));
}

// 9. Write a program to array elements to print cubic values

// Sample Output
// Array = {1, 2, 3, 4, 5}
// Cubic Array Elements =1 8 27 64 125

    private static void printCubicArrValues() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter array size: ");
        int arrSize = in.nextInt();
        int[] a = new int[arrSize];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("element of a[%d] = ",i);
            a[i] = in.nextInt();
        }

        System.out.print("Cubic array elements are ");
        for (int i : a) {
            System.out.print(i*i*i+" ");

        }
    }


}

/*








10. Write a program to find the maximum and minimum element in an array

Sample Output
Array = {23, 4, 32, 5, 75}
Maximum Element of Array = 75
Minimum Element of Array = 4



11. Write a program to array elements print all Odd number

Sample Output
Array = {23, 45, 67, 34, 78}
Odd Array Elements = 23 45 67


12. Write a program to array elements print all Even number

Sample Output
Array = {23, 45, 89, 34, 12}
Even Array Elements = 34 12


13. Write a program to array elements to print sum of Odd Numbers

Sample Output
Array = {12, 34, 59, 45, 22}
Sum of Odd Array Elements = 104


14. Write a program to array elements to print sum of Even Numbers

Sample Output
Array = {56, 78, 45, 79, 34}
Sum of Even Array Elements = 168


15. Write a program to array elements to print sum of Cubic Values

Sample Output
Array = {1, 2, 3, 4, 5}
Sum of Cubic Array Elements = 225


16. Write a program in to copy the elements of one array into another array

Sample Output
Array = {1, 2, 3, 4, 5}
Copy Array Elements one to Another Array = {1, 2, 3, 4, 5}


17. Write a program to merge two arrays elements to store third array

Sample Output
First Array = {1, 2, 3, 4, 5}
First Array = {6, 7, 8, 9, 10}
Merge two Array Elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}


18. Write a program to array elements print all Positive number

Sample Output
Array = {67, -4, 3, -5, 44}
Positive Array Elements = {67, 3, 44}



19. Write a program to array elements print all Negative number

Sample Output
Array = {-45, 32, -7, 3, -6}
Negative Array Elements = {-45, -7, -6}


20. Write a program to array elements to print sum of Positive Numbers

Sample Output
Array = {1, -2, 3, 3, 4}
Sum of Positive Array Elements = 7


21. Write a program to array elements to print sum of Negative Numbers

Sample Output
Array = {10, -23, 45, -10, 30}
Sum of Negative Array Elements = -33


22. Write a program to search an element in an array

Sample Output
Array = {10, 20, 30, 40, 50}
Search Array Elements = 30
Element is Found in the Position = 3
Element is Found in the Index = 2


23. Write a program to Delete Duplicate Elements from an Array

Sample Output
Array = {10, 10, 20, 20, 30}
After Remove Duplicate Array Elements = {10, 20, 30 }


24. Write a program to Print Unique Elements in Array

Sample Output
Array = {10, 20, 40, 20, 10}
Display Array Unique Elements = {10, 20, 40 }


25. Write a program to find the second smallest element in an array

Sample Output
Array = {10, 20, 5, 2, 30}
Second Smallest Element = 5


26. Write a program that identifies the Even elements in two arrays and creates a third array with those elements

Sample Output
First Array = {1, 2, 3, 4, 5}
Second Array = {6, 7, 8, 9, 10}
Even Element Store in Third Array = {2, 4, 6, 8, 10}


27. Write a program that identifies the Odd elements in two arrays and creates a third array with those elements

Sample Output
First Array = {1, 2, 3, 4, 5}
Second Array = {6, 7, 8, 9, 10}
Odd Element Store in Third Array = {1, 3, 5, 7, 9}


28. Write a program to find the common elements between two arrays of integers

Sample Output
First Array = {10, 20, 30, 40, 50}
Second Array = {10, 30, 60, 50, 70}
Common Array Elements = {10, 30, 50}


29. Write a program to find the second Largest element in an array

Sample Output
Array = {10, 20, 30, 40, 50}
Second Largest Element = 40


30. Write a program to find a missing number in an array

Sample Output
Array = {1, 2, 4, 5, 6, 7}
Missing Array Number = 3


31. Write a program to Sort an array in ascending order using quicksort

Sample Output
Array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78}
Sorted Array in Ascending Order = 2 13 17 18 23 30 46 52 65 78


32. Write a program to Sort an array in descending order using bubble sort

Sample Output
Array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78}
Sorted Array in Descending Order = 78 65 52 46 30 23 18 17 13 2


33. Write a program to Sort an array in ascending order using bubble sort

Sample Output
Array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78}
Sorted Array in Ascending Order = 2 13 17 18 23 30 46 52 65 78


34. Write a program to Sort an array in descending order using selection sort

Sample Output
Array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78}
Sorted Array in Descending Order = 78 65 52 46 30 23 18 17 13 2


35. Write a program to Sort an array in ascending order using selection sort

Sample Output
Array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78}
Sorted Array in Ascending Order = 2 13 17 18 23 30 46 52 65 78


36. Write a program to Search an item in an array using binary search

Sample Output
Array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
Enter Item to Search = 60
Item Found at 5 Position


37. Write a program to Search an item into the array using linear search

Sample Output
Array = {10, 20, 30, 56, 84}
Item to Search = 30
Item Found at Index = 2


38. Write a program to Find prime and non-prime numbers in the array

Sample Output
Array = {3, 12, 21, 11}
3 - Prime
12 - Not Prime
21 - Not Prime
11 - Prime


39. Write a program to Move all zero at the end of the array

Sample Output
Array = {1,0,45,34,0,67,2,0,6,67,45,2,0,10}
Array after Moving Zeros to End = 1 45 34 67 2 6 67 45 2 10 0 0 0 0


40. Write a program to Read and print a Two Dimensional array

Sample Output
Rows = 2
Columns = 3

Enter Array Elements a[0][0] = 1
Enter Array Elements a[0][1] = 2
Enter Array Elements a[0][2] = 3
Enter Array Elements a[1][0] = 4
Enter Array Elements a[1][1] = 5
Enter Array Elements a[1][2] = 6

Display 2D Array Element
1 2 3
4 5 6

 */