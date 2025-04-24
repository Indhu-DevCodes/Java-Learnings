package DSA.PatternQues;

import java.util.Scanner;

public class Star_Program {
    
  public static void main(String[] args){
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
        // pattern13();
        // pattern14();
        pattern15();
        pattern16();
        pattern17();
        pattern18();
        pattern19();
        pattern20();


    }




    /*
1.
    *****
    *****
    *****
    *****
    *****
     
     */
    private static void pattern1(){
        // hit: row 5 col 5
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


/*

2.  *
    **
    ***
    ****
    *****

 */

    private static void pattern2() {
       int n = userInput();
       for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
       }
    }

    /*
     
3.  *****
    ****
    ***
    **
    *

     */

     private static void pattern3() {
        int n = userInput();
        // for (int row = 1; row <= n; row++) {
        //     for (int col = n; col >= row; col--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for (int row = 1; row <= n; row++) {
             // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }


/*

4.       *
        **
       ***
      ****
     *****

 */

    private static void pattern4() {
       int n = userInput();
       for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
       }
    }

    /*
     
5.   *****
      ****
       ***
        **
         *

     */

     private static void pattern5() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


/*
 
6.      *
       ***
      *****
     *******
    *********

 */

private static void pattern6() {
    int n = userInput();
    for (int row = 1; row <= n; row++) {
        for (int s = 1; s <= n-row; s++) {
            System.out.print(" ");
        }
        for (int col = 1; col <= (row*2)-1; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
 
 
 /*

7.  *********
     *******
      *****
       ***
        *
  */

private static void pattern7() {
   int n = userInput();
   for (int row = 0; row <= n; row++) {
        for (int s = 0; s < row; s++) {
            System.out.print(" ");
        }
        for (int col = 0; col <= ((2*n)-(2*row)); col++) {
            System.out.print("*");
        }
        System.out.println();
   }
}


/*
8.       *
        * *
       * * *
      * * * *
     * * * * *

 */

private static void pattern8() {
    int n = userInput();
    for (int row = 1; row <= n; row++) {
        for (int s = 1; s <= n-row; s++) {
            System.out.print(" ");
        }
        for (int col = 1; col <= row; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}


 /*
  
9.   * * * * *
      * * * *
       * * *
        * *
         *
         
  */

    private static void pattern9() {
        int n = userInput();
        for ( int row = 1; row <= n; row++) {
            for (int s = 1; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*
 
Pattern 10

*
* *
* * *
* * * *
* * * * *

 */

    private static void pattern10() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*
 
Pattern 11

        *
      * *
    * * *
  * * * *
* * * * *

 */
     
    private static void pattern11() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 
/*

pattern 12
 
         *
        * *
       *   *
      *     *
     *********
*/

    private static void pattern12() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n-row; s++) {
                System.out.print(" ");
            }
            for ( int col = 1; col <= (row*2) - 1; col++) {
                if (col == 1 || col == (row*2 -1)||row == n) {
                    System.out.print("*");
                } else{
                     System.out.print(" ");
                }
                
            }
            System.out.println();
        }
       
    }


/* 

pattern 13

     *********
      *     *
       *   *
        * *
         *
 */

    private static void pattern13() {
        int n = userInput();
        // for (int row = n; row >= 1; row--) {
        //     for (int s = 1; s < n-row+1; s++) {
        //         System.out.print(" ");
        //     }
        //     for (int col = 1; col <= 2*row-1; col++) {
        //         if (col == 1 || row == n || col == (row*2 -1)) {
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        for (int row = 0; row < n; row++) {
            // Print leading spaces
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }

            // Print stars and spaces in between
            for (int col = 0; col < (2 * (n - row) - 1); col++) {
                if (row == 0 || col == 0 || col == (2 * (n - row) - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
     
    }

/*

Pattern 14

       ****
       *  *
       *  *
       *  *
       ****

 */

    private static void pattern14() {
        int n = userInput();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-1; col++) {
                if (row == 1 || row == n ) {
                    System.out.print("*");
                }
                else{
                    if ( col == 1 || col == n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
       
    }


/*

Pattern 15

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/    

    private static void pattern15() {
        int n = userInput();
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }
      
        
    }

/*
 
Pattern 16

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

 */

    private static void pattern16() {
    //   int n = userInput();
    //   for (int row = 1; row < 2 * n; row++) {
    //     for (int col = 1; col <= n-row; col++) {
    //         System.out.print(" ");
    //         if (row > n) {
    //             for (int i = 0; i < row - n; i++) {
    //                 System.out.print(" ");

    //             }
    //         }
    //     }
    //     for (int i = 1; i <= row; i++) {
    //        System.out.print("*"); 
    //     }
    //     System.out.println();
      }

    //    // Full pattern height is 2 * rows - 1
    //    for (int i = 1; i <= 2 * rows - 1; i++) {
    //     int totalColsInRow = i <= rows ? i : (2 * rows - i);      // number of stars
    //     int spaces = i <= rows ? rows - i : i - rows;             // number of spaces

    //     // Print spaces
    //     for (int j = 1; j <= spaces; j++) {
    //         System.out.print(" ");
    //     }

    //     // Print stars
    //     for (int j = 1; j <= totalColsInRow; j++) {
    //         System.out.print("*");
    //     }

    //     System.out.println();
    // }
    // }

/*
 pattern 17

     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
     
 */
    
    private static void pattern17() {
        int n = userInput();
        for (int row = 1; row <= 2 * n; row++) {
            int totalSpace = row <= n ? row : row - n; 
            for (int s = 1; s < totalSpace; s++) {
                System.out.print(" "); 
             }
          
            int totalCol = row <= n ? n - row + 1 : row;
            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
              }
              System.out.println();
          }
        }
    

/*

pattern 18

* * * * *
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *

 */
       
    private static void pattern18() {
      
    }
    
/*
Pattern 19

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */
    private static void pattern19() {
      
    }

/*

pattern 20

         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */
       
    private static void pattern20() {
      
    }

/*

    pattern 21
         
      **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********

 */

    private static void pattern21() {
      
    }
    




    private static int userInput(){
        System.out.print("enter a number that you want to print pattern: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }



     /* 



19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *




23.        *      *
         *   *  *   *
       *      *      *

24.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

25.       *****
         *   *
        *   *
       *   *
      *****



28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

29.      
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *



32.    E
       D E
       C D E
       B C D E
       A B C D E

33.    a
       B c
       D e F
       g H i J
       k L m N o
     
34.    E D C B A
       D C B A
       C B A
       B A
       A
       


Output
A
A B
A B C
A B C D
A B C D E



Pattern 5
Output
A
B B
C C C
D D D D
E E E E E




Pattern 9

Output
     A
    A B
   A B C
  A B C D
 A B C D E
Pattern 10

Output
     E
    D E
   C D E
  B C D E
 A B C D E




Pattern 13
Output
    A
   B B
  C C C
 D D D D
E E E E E


Pattern 18

Output
A B C D E
A B C D
A B C
A B
A

Pattern 19

Output
E D C B A
E D C B
E D C
E D
E

Pattern 20
Output
E
E D
E D C
E D C B
E D C B A

Pattern 21

Output
A
B C
D E F
G H I J
K L M N O


Pattern 23

Output
    A
   A A
  A B A
 A C C A
A D F D A


Pattern 25

Output
A
A B
A B C
A B C D
A B C D E
A B C D
A B C
A B
A



Pattern 30

Output
A B C D E
A B C D
A B C
A B
A
A B
A B C
A B C D
A B C D E

Pattern 31

Output
E D C B A
D C B A
C B A
B A
A
B A
C B A
D C B A
E D C B A

Pattern 34

Output
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
 
Pattern 35

Output
1 0 0 0 0
0 2 0 0 0
0 0 3 0 0
0 0 0 4 0
0 0 0 0 5
 

Pattern 37

Output
A A A A A
A A A B B
A A C C C
A D D D D
E E E E E
 

Pattern 39

Output
     A
    A B
   A B C
  A B C D
 A B C D E
  A B C D
   A B C
    A B
     A



       */
}
