package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        
               String name = "indu hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.lastIndexOf("planet"));

        String name2 = "     kunal  ";
        System.out.println(name2);
//      System.out.println(name2.strip());      // extra spaces are removed
        System.out.println(name2.trim());
        System.out.println(name2.toCharArray());
        System.out.println(name2);
        System.out.println(myStr.substring(2));

        String name3 = "indu hello world";
        System.out.println(Arrays.toString(name3.split(" ")));

    }
}
