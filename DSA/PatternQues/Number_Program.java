package DSA.PatternQues;

import java.util.Scanner;

public class Number_Program {
    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7();
        // pattern8();
        // pattern9();
        // pattern10();
        // pattern11();
        // pattern12();
        pattern13();
        pattern14();
        pattern15();
    }

    /*
    pattern 1

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */

    private static void pattern1() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
          for (int col = 1; col <= row ; col++) {
              System.out.print(col+" ");
          }
          System.out.println();
        }
    }

    /*
  
  Pattern 2

  1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5

     */
    private static void pattern2() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    /*
     
Pattern 3

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
     */
    private static void pattern3() {
      int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    /*
     
Pattern 4

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
     */
    private static void pattern4() {
      int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print(col+" ");
            }
    
            System.out.println();
        }
    }

    /*

Pattern 5

5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

     */
    private static void pattern5() {
      int n = userInput();
      for (int row = 1; row <= n; row++) {
          for (int col = n; col >= n-row+1 ; col--) {
              System.out.print(col+" ");
          }
  
          System.out.println();
      }
    }

/*
 
Pattern 6

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */

    private static void pattern6() {
      int n = userInput();
      int num = 1;
      for (int row = 1; row <= n; row++) {
          for (int col = 1; col <= row ; col++) {
              System.out.print(num+" ");
              num++;
          }
          System.out.println();
      }
    }

    /*

    Pattern 7

      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

     */
    private static void pattern7() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
              System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    /*
     Pattern 8

       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

     */
    private static void pattern8() {
      int n = userInput();
      for (int row = 0; row < n; row++) {
          for (int col = 0; col <= row ; col++) {
              System.out.print((((row + col) % 2 == 0) ? 1 : 0) + " ");
          }
          System.out.println();
      }
    }

    /*
     
Pattern 9

     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5

     */
    private static void pattern9() {
      int n = userInput();
      for (int row = 1; row <= n; row++) {
          for (int s = 1; s < n-row+1; s++) {
              System.out.print(" ");
          }
          for (int col = 1; col <= row ; col++) {
            System.out.print(col+" ");
          }
          System.out.println();
      }
    }

    /*
     Pattern 10

       5
      4 5
     3 4 5
    2 3 4 5
   1 2 3 4 5

     */
    private static void pattern10() {
      int n = userInput();
      for (int row = 1; row <= n; row++) {
          for (int s = 1; s < n-row+1; s++) {
            System.out.print(" ");
          }
          for (int col = n-row+1; col <= n ; col++) {
            System.out.print(col+" ");
          }
          System.out.println();
      }
    }

    /*
Pattern 11

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

     */

    private static void pattern11() {
      int n = userInput();
      for (int row = 1; row <= n; row++) {
          for (int s = 1; s < n - row + 1; s++) {
            System.out.print(" ");
          }
          for (int col = 1; col <= row ; col++) {
            System.out.print(row+" ");
          }
          System.out.println();
      }
    }

    /*
    
Pattern 12

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

     */
    private static void pattern12() {
      // int n = userInput();
      // for (int row = 1; row <= n; row++) {
      //     for (int s = 1; s < ; s++) {
      //       System.out.print(" ");
      //     }
      //     for (int col = ; col <= n ; col++) {
      //       System.out.print(col+" ");
      //     }
      //     System.out.println();
      // }
    }

    /*
Pattern 13

Output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

     */
    private static void pattern13() {
      int n = userInput();
      for (int row = 1; row <= 2 * n - 1; row++) {
          for (int col = 1; col <= row; col++) {
            System.out.print(col+" ");
            
          }
          System.out.println();
      }
    }

    /*
    
Pattern 14

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

     */
    private static void pattern14() {
      // int n = userInput();
      // for (int row = 1; row <= n; row++) {
      //     for (int s = 1; s < ; s++) {
      //       System.out.print(" ");
      //     }
      //     for (int col = ; col <= n ; col++) {
      //       System.out.print(col+" ");
      //     }
      //     System.out.println();
      // }
    }
    
/*

Pattern 29

5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

 */
    private static void pattern15() {
      // int n = userInput();
      // for (int row = 1; row <= n; row++) {
      //     for (int s = 1; s < ; s++) {
      //       System.out.print(" ");
      //     }
      //     for (int col = ; col <= n ; col++) {
      //       System.out.print(col+" ");
      //     }
      //     System.out.println();
      // }
    }

    private static int userInput(){
        System.out.print("enter a number that you want to print pattern: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}

/* 
 
 
      35.    1      1
       12    21
       123  321
       12344321


27.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11


30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

Pattern 33

Output
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

31.      4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4   

         Pattern 36

Output
1 1 1 1 1
1 1 1 2 2
1 1 3 3 3
1 4 4 4 4
5 5 5 5 5
 

16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


17.      1
        212
       32123
      4321234
       32123
        212
         1

         Pattern 38

Output
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
 

*/