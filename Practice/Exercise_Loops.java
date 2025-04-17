package Practice;

import java.util.Scanner;

public class Exercise_Loops {
    
    public static void main(String[] args) {
        // naturalNumbers();
        naturalNumbersReverse();
    }

    // write a program to print all natural numbers from 1 to n
    private static void naturalNumbers() {
        int start = userInputNumbers();
        int end = userInputNumbers();
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    // write a program to print all natural number in reverse
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

    private static int userInputNumbers() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
       
    
}
