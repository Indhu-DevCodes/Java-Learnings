package ConditionalStatements_04;

public class ElseIf {

    public static void main(String[] args) {
        int a = 100;
        int b = 90;
        int c = 110;
        
        if (a>b && a>c) {
            System.out.println("a is greaterthan b and c");
        } else if (b>a && b>c) {
            System.out.println("b is greaterthan b and c");
        }
    }
}