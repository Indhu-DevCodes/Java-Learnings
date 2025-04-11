import java.util.Scanner;

public class LargestNumber {
    
    //Q : find the largestNumber from given input

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // way - 1
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);

        // way - 2
        int max1 = Math.max(c, Math.max(a, b));
        System.out.println(max1);
    }
}