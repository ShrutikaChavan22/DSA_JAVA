// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
package patterns;
import java.util.*;

public class Pattern12 {

    public void pattern12(int n) {
        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void main(String args[]) {
        Pattern12 p12 = new Pattern12();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p12.pattern12(n);
        sc.close();
    }
}
