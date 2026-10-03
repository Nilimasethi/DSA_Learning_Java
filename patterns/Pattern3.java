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
 *
 * Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 *
 */
public class Pattern3 {

    static  int n;

    public static void p3(){
        for(int i=0; i <n ; i++){
            for(int j=0; j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        n=t.nextInt();
        p3();
    }
}
