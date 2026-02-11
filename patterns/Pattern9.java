package patterns;
import java.util.*;

public class Pattern9 {

    public void pattern9(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n-1; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * n - 1)-(2*i); j++) {
                System.out.print("*");
            }
           for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
         System.out.println();
    }
    }
    public static void main(String args[]) {
        Pattern9 p9 = new Pattern9();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p9.pattern9(n);
        sc.close();
    }
}
