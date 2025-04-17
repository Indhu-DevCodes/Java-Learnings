package Strings;

public class StringsIntro {

    public static void main(String[] args) {
        
        
        int[] arr = {1,2,3,4,6};
        int a = 10;
        String name1 = "indhu";     //collection of character is called String
        String name2 = "indhu";  //here name1 & name2 both are pointing to same obj in memory(in string pool)
//

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

        name1 = "cool"; //this object is created newly in memory.

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
    }
}

/*

String a = "indhu";
here,
String is dataType
a is reference variable
"indhu" -> is object

> String pool
It is separate memory structure inside the heap
Usecase of String Pool - All the similar values of strings are not recreated in the pool.
for examole, If "indhu" is already there then this will point to the same obj it won't recreate.

String a = "indhu";
String b = "indhu";  //here a & b are pointing to same variable in memory

and here If we tried to change a = "cool" then this obj won't replace with "indhu" in memory. "cool" obj will create newly in memory.
this is called Strings are Immutable(can't be changed)

Why we can't modify Strings object in memory?
for security reasons..
for example, here we have person1, person2, person3, person4 all the 4 ref variables pointing to same obj in Memory If person1 wants to 
change their object then other 3 person's object will be changed automatically
so that's why we can't modify string objects in memory
 */