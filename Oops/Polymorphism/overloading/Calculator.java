package Oops.Polymorphism.overloading;

public class Calculator {

    double sum(int a, double b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.sum(2,5));
        System.out.println(obj.sum(2,5.0));
        System.out.println(obj.sum(2,5,7));

        obj.sum(2,5.0);
        obj.sum(2,5,7);
//        obj.sum(2);  // giving error while compile time
    }
}