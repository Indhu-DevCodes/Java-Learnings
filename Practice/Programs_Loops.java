package Practice;

import java.util.Scanner;

import javax.swing.text.View;

public class Programs_Loops {
    
    public static void main(String[] args) {
        // naturalNumbers();
        // naturalNumbersReverse();
        // printTables();
        // reverseATable();
        // printAlphabets();
        // reverseAlphabets();
        // printEvenNumbers();
        // printOddNumbers();
        // sumOfNumbers();
        // sumOfAllEvenNumbers();
        // findASCIIvalue();
        // findFactorialNumber();
        // findResultOfPowerNumber();
        reverseGivenDigits();
    }

    // 1. Write a program to print all natural numbers from 1 to n
    private static void naturalNumbers() {
        int start = userInputNumbers();
        int end = userInputNumbers();
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    // 2. Write a program to print all natural numbers in reverse
    private static void naturalNumbersReverse() {
        int start = userInputNumbers();
        System.out.print("enter start number: "+start);
        System.out.println();
        int end = userInputNumbers();
        System.out.print("enter end number: "+end);

        if (start > end) {   
            for (int i = start; i >= end; i--) {
                System.out.println(i);
            } 
        } else {
            System.out.println("starting number should be greaterthan to ending number");
        }
    
    }

    // 3. Write a program to print tables
    private static void printTables() {
        int num = userInputNumbers();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + num + " = " + (i*num));
        }
    }

    // 4. Write a program to print reverse tables
    private static void reverseATable() {
        System.out.print("enter start number: ");
        int start = userInputNumbers();
        System.out.print("enter end number: ");
        int end = userInputNumbers();
        System.out.print("enter end number: ");
        int target = userInputNumbers();
        if (start > end) {
            while (start >= end) {
                System.out.println(start + " * " + target + " = " + (start*target));
                start--;
            }
        } else {
            System.out.println("start number should be highest because we are reversing a table.");
        }
    }

    // 5. Write a program to print all alphabets from a to z
    private static void printAlphabets() {
       char ch = 'a';
       while (ch <= 'z') {
        System.out.print(ch + " ");
        ch++;
       }
    }

    // 6. Write a program to print reverse alphabets from Z to A
    private static void reverseAlphabets() {
       for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
       }
     }
 
     // 7. Write a program to print all even numbers between 1 to 100
     private static void printEvenNumbers() {
        System.out.print("enter start number: ");
        int start = userInputNumbers();
        System.out.print("enter end number: ");
        int end = userInputNumbers();
        int totalEvenNum = 0;
        for (int i = start; i <= end; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
                totalEvenNum += 1;
            } 
        }

        System.out.println();
        System.out.println("total even number is "+ totalEvenNum);

    }

    // 8. Write a program to print all odd number between 1 to 100
    private static void printOddNumbers() {
        System.out.print("enter the number of limit: ");
        int l = userInputNumbers();
        int s=1;
        int totalOddNum = 0;
        while (s<=l) {
                if (s%2!=0)
                   {
                    System.out.print(s+" ");
                    totalOddNum += 1;
                   }
            s++;
        }

        System.out.println();
        System.out.println("total odd number is "+ totalOddNum);
    }

    // 9. Write a program to find sum of all natural numbers between 1 to n
    private static void sumOfNumbers() {
       System.out.print("enter number of limit: ");
       int n = userInputNumbers();
        int sum = 0;
       for (int i = 1; i <= n; i++) {
            sum += i;
       }
       System.out.println(sum);
    }

    // 10. Write a program to find sum of all even numbers between 1 to n
    private static void sumOfAllEvenNumbers() {
        System.out.print("enter number of limit: ");
        int n = userInputNumbers();
         int sumEvenNum = 0;

         for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                sumEvenNum += 1;
            }
         }
         System.out.println(sumEvenNum);

    }
    
    // 11. Write a program to find sum of all odd numbers between 1 to n
    private static void sumOfAllOddNumbers() {
        System.out.print("enter number of limit: ");
        int n = userInputNumbers();
         int sumOddNum = 0;

         for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                sumOddNum += 1;
            }
         }
         System.out.println(sumOddNum);
    }

    // 12. Write a program to print the ASCII values
    private static void findASCIIvalue() {
        for (int i = 1; i <= 255; i++) {
            System.out.println((char)i);
        }
        
    }

    // 13. Write a program to find the factorial value of any number
    // input 5 then 1 * 2 * 3 * 4 * 5 = 120 is answer 
    private static void findFactorialNumber() {
        System.out.print("enter a number limit: ");
        int n = userInputNumbers();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        System.out.println(result);
    }

    // 14. Write a program to find the value of one number raised to the power of another
    // if base is 2 and power is 5, the loop will run from 1 to 5, multiplying result by 2 each time through the loop, resulting in result equaling 32
    private static void findResultOfPowerNumber() {
        System.out.print("enter base number: ");
        int base = userInputNumbers();
        System.out.print("enter power number: ");
        int power = userInputNumbers();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println("Result: "+ result);
    }

    
    // 15. write a program to reverse the given Digits
    private static void reverseGivenDigits() {
        System.out.println("enter a number : ");
        int numDigits = userInputNumbers();
        int remider = 0;
        int reversed = 0;
        // while(n > 0){
        //     remider%
        // }

    }

// 16. write a program to sum of its Digits
// 17. write a program to Check Whether a Given Number is Prime or Not
// 18. Write a program to calculate HCF of Two given number

    private static int userInputNumbers() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
       
    
}


// 19. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
// 20. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered
// 21. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
// 22. Write a program to convert a binary number into a decimal number without using array, function and while loop
// 23. Write a program to check whether a number is a Strong Number or not
// 24. Write a program to convert Hexadecimal to Decimal number system
// 25. Write a Program to convert Hexadecimal to Octal number system
// 26. Write a program to convert Hexadecimal to Binary number system
// 27. Write a program to convert Decimal to Hexadecimal number system
// 28. Write a program to convert Decimal to Octal number system
// 29. Write a program to convert Decimal to Binary number system
// 30. Write a Program to convert Binary to Octal number system
// 31. Write a program to convert Binary to Decimal number system
// 32. Write a program to convert Binary to Hexadecimal number system
// 33. Write a program to convert Octal to Binary number system
// 34. Write a program to convert Octal to Decimal number system
// 35. Write a program to convert Octal to Hexadecimal number system
// 36. Write a program to find 1s complement of a number in java
// 37. Write a program to find 2s complement of a Binary number in java
// 38. Write a program to print fibonacci series upto n terms
// 39. Write a program to check Strong numbers or Not
// 40. Write a program to print All Strong numbers 1 to 100000
// 41. Write a Program to print All perfect numbers 1 to 10000
// 42. Write a Program to check perfect numbers or Not
// 43. Write a Program to print All Armstrong numbers between 1 to 1000
// 44. Write a Program to check Armstrong numbers or Not
// 45. Write a Program to print Prime factors in java
// 46. Write a Program to check Prime numbers or Not
// 47. Write a Program to print Factors of a Positive Integer
// 48. Write a Program to print Factors of a Negative Integer
// 49. Write a Program to Check Given Number is a Palindrome or Not
// 50. Write a Program to Check Given String is a Palindrome or Not
// 51. Write Java program to print bits that need to be flipped to convert a number to another number
// 52. Write Java program to Count the number of bits to be flipped to convert a number to another number
// 53. Write Java program to Round off an integer number to the next lower multiple of 2
// 54. Write Java program to Find the position of MSB bit of an integer number
// 55. Write Java program to Count the total HIGH bits in the given number
// 56. Write Java program to Implement infinite loop using do-while loop
// 57. Write Java program to Implement infinite loop using while loop
// 58. Write Java program to Implement infinite loop using for loop
// 59. Write Java program to Print string in hexadecimal format
// 60. Write Java program to Find the (GCD) Greatest Common Divisor
// 61. Write Java program to Find the (LCM) Lowest Common Multiple
// 62. Write Java program to Extract words from a given sentence
// 63. Write Java program to Print Fibonacci Series
// 64. Write Java program to Find Factorial of a Number
// 65. Write Java program to Generate Random Numbers from 0 to given Range
// 66. Write Java program to Find addition of N integer numbers
// 67. Write Java program to count total number of words in a string
// 68. Write Java program to print used different characters (letters) in a string
