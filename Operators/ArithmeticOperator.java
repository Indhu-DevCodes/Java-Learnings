package Operators_03;

public class ArithmeticOperator {

    public static void main(String[] args) {
        int a,b,c;
        a = 100;
        b = 10;
        c = a+b;
        System.out.println("Addition: "+c);
        c = a-b;
        System.out.println("Subtraction: "+c);
        c = a*b; 
        System.out.println("Multiplication: "+c);
        c = a/b;
        System.out.println("Division: "+c);
        c = a%b;
        System.out.println("Modulus: "+c);

        int result = a;

        // post increment
        System.out.println(result++);  //100
       
        // post decrement
        System.out.println(result--);  //101

        // pre increment
        System.out.println(++a);   // 101

        // pre decrement
        System.out.println(--a);   //100

    }
    
}

/* 
+	Addition -- Adds together two values (x + y)
-	Subtraction	-- Subtracts one value from another (x - y)	
*	Multiplication -- Multiplies two values	(x * y)	
/	Division -- Divides one value by another (x / y)	
%	Modulus -- Returns the division remainder (x % y)	
++	Increment -- Increases the value of a variable by 1	(++x) 
--	Decrement -- Decreases the value of a variable by 1	(--x) 
two types of increament and decrement -> post(after) and pre(before)
*/