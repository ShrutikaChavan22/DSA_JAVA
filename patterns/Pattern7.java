//    *
//   ***
//  *****
// *******
   
package patterns;
import java.util.*;

public class Pattern7 {

    public void pattern7(int n) {
        

        for(int i = 1; i <= n; i++) {

            // Print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern7 p7 = new Pattern7();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p7.pattern7(n);
        sc.close();
    }
}
