package Arrays;

import java.util.Arrays;

public class ArraysclassMethods {
    public static void main(String[] args) {

/*
compare() method compares two arrays lexicographically.

Syntax
Arrays.compare(array1, array2)

Returns 0 if the arrays are equal.
Returns a negative integer if the array1 is less than array2 lexicographically
Returns a positive integer if array1 is greater than array2 lexicographically.
 */

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,7};

        System.out.println(Arrays.compare(arr1,arr2));  // -1
        System.out.println(Arrays.compare(arr2,arr1));  // 1

// copyOf() -- Creates a copy of an array with a new length
        // Copying an Entire Array
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);    
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        //  Copying with a Larger Size
        int[] originalArray1 = {1, 2, 3};
        int[] extendedArray = Arrays.copyOf(originalArray1, 5);
        System.out.println("Extended Array: " + Arrays.toString(extendedArray));

        // Copying with a Smaller Size
        String[] originalArray2 = {"Java", "Python", "C++", "JavaScript"};
        String[] truncatedArray = Arrays.copyOf(originalArray2, 2);
        System.out.println("Truncated Array: " + Arrays.toString(truncatedArray));  // truncate (meaning)- discarding fractional part of a nunbers

// deepEquals()	Compares two multidimensional arrays to check whether they are deeply equal to each other
// The method returns true if the two arrays are deeply equal, otherwise it returns false.
        // Comparing Simple Arrays        
        String[] array1 = {"Java", "Python", "C++"};
        String[] array2 = {"Java", "Python", "C++"};
        boolean result1 = Arrays.deepEquals(array1, array2);
        System.out.println("Are the simple arrays deeply equal? " + result1);  //true

        // Comparing Nested Arrays
        String[][] array3 = {{"Java", "Python"}, {"C++", "JavaScript"}};
        String[][] array4 = {{"Java", "Python"}, {"C++", "JavaScript"}};
        boolean result2 = Arrays.deepEquals(array3, array4);
        System.out.println("Are the nested arrays deeply equal? " + result2);  //true

        //  Comparing Arrays with Different Structures
        String[][] array5 = {{"Java", "Python"}, {"C++"}};
        String[][] array6 = {{"Java", "Python"}, {"C++", "JavaScript"}};
        boolean result3 = Arrays.deepEquals(array5, array6);
        System.out.println("Are the arrays with different structures deeply equal? " + result3);  //false 

// equals()	Checks if two arays are equal
        // Comparing Integer Arrays
        // int[] array1 = {1, 2, 3, 4, 5};
        // int[] array2 = {1, 2, 3, 4, 5};
        // boolean areEqual = Arrays.equals(array1, array2);
        // System.out.println("Are integer arrays equal? " + areEqual);

        // //Comparing Character Arrays
        // char[] array1 = {'a', 'b', 'c'};
        // char[] array2 = {'a', 'b', 'd'};
        // boolean areEqual = Arrays.equals(array1, array2);
        // System.out.println("Are character arrays equal? " + areEqual);

        // // Comparing Object Arrays
        // String[] array1 = {"Java", "Python", "C++"};
        // String[] array2 = {"Java", "Python", "C++"};
        // boolean areEqual = Arrays.equals(array1, array2);
        // System.out.println("Are object arrays equal? " + areEqual);

// fill() -- Fills an array with a specified value

// mismatch()	Returns the index position of the first mismatch/conflict between two arrays
// sort()	Sorts an array in ascending order
    }
}

/*
Tips and Best Practices
-- Use for Primitive Types: Arrays.equals() is efficient for comparing arrays of primitive types as it uses a straightforward element-by-element comparison.
-- Deep Comparison for Nested Arrays: For arrays containing other arrays (e.g., int[][]), use Arrays.deepEquals() to perform a deep comparison.
        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{1, 2}, {3, 4}};
        boolean areDeepEqual = Arrays.deepEquals(array1, array2);
-- Null Handling: If either of the arrays being compared is null, Arrays.equals() returns false unless both are null, in which case it returns true.
-- Avoid Manual Loops: Instead of writing manual loops to compare arrays, use Arrays.equals() for cleaner and more readable code.
 */

