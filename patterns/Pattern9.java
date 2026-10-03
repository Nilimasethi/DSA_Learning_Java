package patterns;

import java.util.Scanner;

/*
 * n = 5
 *
 * Rules:
 * 1. Use nested loop
 * 2. Outer loop runs = no of rows
 * 3. Inner loop runs = no of columns
 * 4. Print within the loops
 * 5. Express j as f(i, n)
 *
 * Logic:
 * - Outer loop: i = 0 to n-1  (rows)
 * - Inner loop: j = 0 to ___  (columns)
 * - j = f(i, n) = ___
 * * PATTERN: Pyramid (N=5)
 *
 * Logic:
 * - Outer loop: i = 0 to n-1  (rows)
 *
 * - Inner loop 1 (Spaces):
 *   j = 0 to (n - i - 1)
 *   Prints " " (space)
 *
 * - Inner loop 2 (Stars):
 *   j = 0 to (2 * i + 1)
 *   Prints "*"
 *
 * Output:
 *
 * Row (i)	Spaces	Stars	Visual
 * 0	  	  4	      1      ____*
 * 1		  3       3      ___***
 * 2		  2       5      __*****
 * 3		  1       7      _*******
 * 4		  0       9      *********

 */
public class Pattern9 {

    static  int n;

    public static void p9(){
        for(int i=0; i <n ; i++){
            //For Space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            //For Star *
            for(int j=0; j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        n=t.nextInt();
        p9();
    }
}
