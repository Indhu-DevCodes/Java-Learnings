package DataType_02.DataTypeCasting;

public class TypeCasting {
    
 public static void main(String[] args){
    int num = 10;
    long num1 = num;

    long num2 = 100l;
    int num3 = (int) num2;

    float fl=4.5f; 
    double f2 = 5.5;
    fl = (float) f2;
    
    int num4=(int) fl;
    System.out.println(num1);


    char letter = 'a';
    int charNum = letter;
    char numToChar = (char)charNum;
    
    System.out.println(charNum);
    System.out.println(numToChar);

 }
}


/*
What is type conversion or type casting ?
-- type conversion or type casting  is the process of converting a value from one data type to another data type.
e.g 
int num=5; 
long l=num; 

Different ways to casting 
 a) Implicit type casting :- 
 Widening Casting (automatically) - converting a smaller type to a larger type size
 It is way to in which compiler automatically convert smaller size data type in larger.
 e.g,
 int num=4; 
 long l=num; //now num value converted to long 
 byte -> short -> char -> int -> long -> float -> double

 b) Explicit  type casting :-
 Narrowing Casting (manually) - converting a larger type to a smaller size type
 manually when programmer cast one data type into other is known as explicit type casting.
 e.g, 
 float fl=4.5f; 
 int num=(int)fl; -- num value become 4;
 double -> float -> long -> int -> char -> short -> byte

* 
*/