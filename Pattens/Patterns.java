/* Patten --> Nested Loops
   1) for the outer loop, count the number of lines(rows)
   2) for inner loop, focus on the column & connect them somehow to the rows
   3) print them '*' inside the inner for loop
   4) optional : observe the symmetry
*/
package Pattens;

public class Patterns {
    public static void main(String[] args) {
        // printRectangle(3);
        // printTriangle(5);
        // printTriangleWithNumber(5);
        // printPattern4(5);
        // printPattern5(5);
        // printPattern6(5);
        // printPattern7(5);
        // printPattern8(5);
        printPattern9(5);
    }

    public static void printRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangleWithNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }

    /*  
        1
        2 2 
        3 3 3 
        4 4 4 4 
        5 5 5 5 5
    */

    public static void printPattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }

    /*  
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 
    */

    public static void printPattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*  
        1 2 3 4 5 
        1 2 3 4 
        1 2 3 
        1 2 
        1 
    */

    public static void printPattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }

    /*  
             *     
            ***    
           *****   
          *******  
         ********* 
    */

    public static void printPattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*  
        *********
         ******* 
          *****  
           ***   
            *    
    */

    public static void printPattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*  
            *     
           ***    
          *****   
         *******  
        ********* 
        *********
         ******* 
          *****  
           ***   
            *    
    */

    public static void printPattern9(int n) {
        printPattern7(n);
        printPattern8(n);
    }
}