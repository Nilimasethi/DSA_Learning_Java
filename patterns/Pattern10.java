package patterns;

/*
 * PATTERN: Mountain / Half Diamond
 * n = 5
 *
 * Rules:
 * 1. Use nested loop
 * 2. Outer loop runs = no of rows (2n - 1)
 * 3. Inner loop runs = no of columns (varies by row)
 * 4. Print within the loops
 * 5. Express j as f(i, n)
 *
 * Logic:
 * - Outer loop: i = 0 to (2n - 2)   → total 9 rows
 * - Inner loop:
 *     if i < n  → j = 0 to i         (increasing half)
 *     else      → j = 0 to (2n-i-2)  (decreasing half)
 *
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 */
public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 2 * n - 1; i++) {
            // Determine stars for this row
            int stars;
            if (i < n) {
                stars = i + 1;              // increasing half
            } else {
                stars = 2 * n - i - 1;      // decreasing half
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}