package Operators_03;

public class LogicalOperator {

    public static void main(String[] args) {
        int x = 20;
        System.out.println(x > 3 && x < 10);  //false
        System.out.println(x > 3 || x < 10);  //true
        System.out.println(!(x > 3 && x < 10));  //true

    }
}

/*
If we need to combine the result of two or more relational operators, then we use logical operators.

&& 	Logical and ->	Returns true if both statements are true-- x < 5 &&  x < 10	
|| 	Logical or 	->  Returns true if one of the statements is true-- x < 5 || x < 4	
!	Logical not	->  Reverse the result, returns false if the result is true--	!(x < 5 && x < 10)

*/