package patterns;
import java.util.*;

public class Pattern20 {
    public void pattern20(int n) {
        int cols = 2 * n; // total columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cols; j++) {
                // Top and bottom row
                if (i == 1 || i == n) {
                    if (j == 1 || j == cols)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                // Middle row (full stars)
                else if (i == n / 2 + 1) {
                    System.out.print("*");
                }
                // Rows 2 and n-1
                else {
                    if (j <= i || j > cols - i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern20 p20 = new Pattern20();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        // Ensure n is odd for symmetry
        if (n % 2 == 0) n += 1;

        p20.pattern20(n);
        sc.close();
    }
}
