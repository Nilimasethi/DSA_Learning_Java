package patterns;

/*
 * PATTERN: Hollow Square
 * n = 5
 *
 * Rules:
 * 1. Use nested loop
 * 2. Outer loop runs = no of rows (n)
 * 3. Inner loop runs = no of columns (n)
 * 4. Print within the loops
 * 5. Express j as f(i, n)
 *
 * Logic:
 * - Outer loop: i = 0 to n-1
 * - Inner loop: j = 0 to n-1
 * - Condition to print "*":
 *     i == 0 (top row)     OR
 *     i == n-1 (bottom row) OR
 *     j == 0 (left column) OR
 *     j == n-1 (right column)
 * - Else print " " (space)
 *
 * Output:
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 */
public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}