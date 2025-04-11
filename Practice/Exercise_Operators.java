package Practice;

public class Exercise_Operators {

    public static void main(String[] args) {
        
        /*
         * ======Arithmetic operators=======
         */

         // addition

         int a = 10;
         int b = 10;
        System.out.println(a + b);

        // System.out.println(123804903972374897 + 13481957);  // error..default value is taking as int alone. here it's out of range

        System.out.println(10.20 + 90);     // 

        System.out.println(90 + 6.789);     // 

        float c = 8.23f;

        System.out.println(a + c);

        System.out.println(a + (int)c);  //integer value

        // a = 19.45;  // error.. reasignning the int value with dobuble.

        // (double) a = 19.45;  // error.. wrong casting

        a = (int) 19.45;
        System.out.println(a + b);

        System.out.println(6867885.78649483729 + .232f);  //adding double and float value

        System.out.println(6.43 + 9.02);
       
        System.out.println('a'+2);     // 99

        System.out.println('a');

        System.out.println('a'+'b');  //number will be added ans: 195

        System.out.println(89+2.123f);

        /*
            - Java always promotes smaller types to the larger or more precise type during expressions.
            - byte short char are smaller types and these are automatically promote to int (Type casting is happening but more precisely, it's called type promotion) 
         */


         byte by = 10;
         short sh = 20;
         char ch = 'A';  // ASCII value is 65
         int num = 30;
        // byte + short = int
        System.out.println(by + sh);  // 30 as int value
        // TO check - int type
        System.out.println(((Object)(by + sh)).getClass().getName());  // box this primitive into wrapper class and check

        // byte + char = int
        System.out.println(by + ch);  // 75 as int value
        System.out.println(((Object)(by + ch)).getClass().getName()); 

        // short + char = int
        System.out.println(sh + ch);  // 85
        System.out.println(((Object)(sh + ch)).getClass().getName()); 

       
        // char + int = int
        System.out.println(ch + num);  // 95
        System.out.println(((Object)(ch + num)).getClass().getName()); 


        // more on other premitives
        int in = 70;
        double d = 25.45;
        float fl = 10.25f;
        long lo = 90l;

        // int + double = double
        System.out.println(in + d);  //95.45 as double
        System.out.println(((Object)(in + d)).getClass().getName()); 

        // long + float = float
        System.out.println(lo + fl);    // 100.25 as float
        System.out.println(((Object)(lo + fl)).getClass().getName()); 

        // float + double = double
        System.out.println((fl + d) +" "+ ((Object)(fl + d)).getClass().getName());

        // int + float = float
        System.out.println(in + fl);
        System.out.println(((Object)(in + fl)).getClass().getName());


        // subtraction

        System.out.println(50-500);

        System.out.println(67.25 - 2);
        
        System.out.println(67.25f - 2);

        System.out.println(67.25 - 2f);

        System.out.println(90 - 25.57f);

        System.out.println(90.13f - 25.57f);

        System.out.println(90 - 'i');

        System.out.println(90l + 10);

        /*
         *  Multiplication
         */

         System.out.println(5 * 10);

         System.out.println(5.3 * 20);

         System.out.println('a' * 1);

         System.out.println('a' * 'a');

        // post & pre - increment & decrement
        int i = 0;
        System.out.println(i++  +" after performing operation i value is: "+ i);  // 0
        System.out.println(i);

        System.out.println(i++);  // 1
        System.out.println(i);


        System.out.println(i--);  // 2
        System.out.println(i);

        System.out.println(i--);  // 1
        System.out.println(i);

        i = 5;
        System.out.println(++i +" after performing operation i value is: "+ i);

        System.out.println(--i +" after performing operation i value is: "+ i);

        // post

        i = 10;
        System.out.println(i++ +" :: "+ i--+ " final i value is:"+i );  // 10 + 11 = 21 -->> first i value is 10 after increment it will become 11

        i = 10;
        System.out.println(i-- + i++);  // 10 + 9 = 19

        i = 10;
        System.out.println(i++ + i++);  // 10 + 11 = 21

        i = 10;
        System.out.println(i-- + i--);  // 10 + 9 = 19

        i = 10;
        System.out.println(i++ - i++);  // 10 - 11 = -1

        i = 10;
        System.out.println(i-- - i--);  // 10 - 9 = 1
        
        i = 10;
        System.out.println(i++ - i--);  // 10 - 11 = -1
  
        i = 10;
        System.out.println(i-- - i++ +" final i value is: "+i);  // 10 - 9 = 1  -->> i value is 10

        i = 10;
        System.out.println(--i + "::"+ i++); // 9(pre incrememnt) + 9 = 18 after i value of the increment 10

        // pre
        i = 10;
        System.out.println(++i + --i);   // 11 + 10 = 21

        i = 10;
        System.out.println(++i + ++i);   // 11 + 12 = 23

        i = 10;
        System.out.println(--i + --i);   // 9 + 8 = 17

        i = 10;
        System.out.println(--i + ++i);   // 9 + 10 = 19

        i = 10;
        System.out.println(++i - --i);   // 11 - 10 = 1

        i = 10;
        System.out.println(++i - ++i);   // 11 - 12 = -1

        i = 10;
        System.out.println(--i - --i);   // 9 - 8 = 1

        i = 10;
        System.out.println(--i - ++i);   // 9 - 10 = -1

        /*
         * Assignment operator   
        */
// =	x = 5	x = 5	

        int x = 6;
        System.out.println(x);

// +=	x += 3	x = x + 3
        System.out.println(x += 3);  // 9

        x = 6;
        System.out.println(x += x++); // x = 6 + 6 

        x = 6;
        System.out.println(x+=(x++)+(++x)+x);  // 6 += 6 + 8 + 8  ans is 28

        x = 6;
        System.out.println(x += --x + ++x + x);  // 6 += 5 + 6 + 6  ans is 23

// -=	x -= 3	x = x - 3	

        x = 6;
        System.out.println(x -= 3);  // 6 -=3  ans 3

        x = 6;
        System.out.println(x -= ++x - --x + x-- - x + x);  // 6 -= 7 - 6 + 6 - 5 + 5   ans -1
        
        x = 6;
        System.out.println(x -= x + x-- + x++ + ++x);  // 6 -= 6 + 6 + 5 + 7 ans -18

// *=	x *= 3	x = x * 3	

        x = 6;
        System.out.println(x *= 5);  // 6 *= 5  ans 30

        x = 6;
        System.out.println(x -= x - ++x + x++ + --x);  // 6 -= 6 - 7 + 7 + 7 ans -7

        x = 6;
        System.out.println(x *= x - ++x + x++ + --x);  // 6 *= 6 - 7 + 7 + 7 ans 78

// /=	x /= 3	x = x / 3	
// %=	x %= 3	x = x % 3	
// &=	x &= 3	x = x & 3	
// |=	x |= 3	x = x | 3	
// ^=	x ^= 3	x = x ^ 3	
// >>=	x >>= 3	x = x >> 3	
// <<=	x <<= 3	x = x << 3


/*
 * Comparision operator
 */

//  ==	Equal to--	x == y	
/* 
 * It checks whether the two object references being compared point to the same object in memory
This operator works slightly differently for primitive values ​​and objects. When we use the equality 
operator with primitives, it compares values. On the other hand, when we use it with for objects,
it checks memory references.

*/
        int m = 20, n = 20;
        System.out.println(m == n);  // true

        char ch1 = 'a', ch2 = 'a';      // comparing values because primitives 
        System.out.println(ch1 == ch2);  // true

        String s1 = "indhu";
        String s2 = "indhu";
        System.out.println(s1 == s2);  // true - both var are pointing to same object in scp

        String s3 = new String("indhu");
        System.out.println(s1 == s3);  // false

        String s4 = s1;
        System.out.println(s4 == s2);  // true

//  !=	Not equal--   x != y	

         
//  >	Greater than--  x > y	
//  <	Less than--    x < y	
//  >=	Greater than or equal to--	x >= y	
//  <=	Less than or equal to--	x <= y
 




}

}