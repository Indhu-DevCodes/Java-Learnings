import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); // trim() - removing extra space / charAt(0) - taking 0th index character
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else{
            System.out.println("Upper case");
        }
    
    
    }
}
