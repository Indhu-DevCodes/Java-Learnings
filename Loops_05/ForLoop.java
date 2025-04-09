package Loops_05;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int num = 1; num <= i; num++) {
            System.out.println("Hello world");
        }
    }
    
}