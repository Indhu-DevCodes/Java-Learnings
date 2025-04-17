package Strings;

import java.util.ArrayList;

public class StringsOperators {
    public static void main(String[] args) {
        
           System.out.println('a' + 'b');  //char type - 195 - printing the value of ascii

        System.out.println("a" + "b");  //String type - concating
//        System.out.println("a" - "b");  //String type - Operator '-' cannot be applied to string

        System.out.println('a'+1);      //98
        System.out.println((char)('a'+1));      //b

        System.out.println("a"+1);  //integer will be converted to Integer that will call toString()
        //this is same as after a few steps : "a" + "1"

        System.out.println("indu" + new ArrayList<>());  //String + Object -- ans : indu[]  an empty array
        System.out.println("indu" + new Integer(43));  //String + Wrapper class Object  -- indu43

//        System.out.println(new Integer(43) + new ArrayList<>());    //Operator '+' is cannot be applied
//        // In java, Operator '+' is only define for primitives and complex objects but only condition is any one of these value should be string

        System.out.println(new Integer(43) + "" + new ArrayList<>());  //It will work  -- 43[]
        System.out.println("a"+'b');  //If any one of the character is String then ans will be string. It won't be convert into any other data types
    
    }
}


/*
 * Inside println() >> this takes string arg and changing values which we are passing(or printing) to string
 */