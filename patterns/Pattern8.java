package patterns;
import java.util.*;

public class Pattern8 {

    public void pattern8(int n) {

        for(int i = 1; i <= n-1; i++) {

            // Print spaces
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int j = 1; j <= (2 * n - 1)-(2*i); j++) {
                System.out.print("*");
            }

            // Move to next line
           for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
         System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern8 p8 = new Pattern8();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p8.pattern8(n);
        sc.close();
    }
}
