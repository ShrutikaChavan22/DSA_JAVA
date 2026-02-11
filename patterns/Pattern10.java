// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *  
package patterns;
import java.util.*;

public class Pattern10 {

    public void pattern10(int n) {

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern10 p10 = new Pattern10();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p10.pattern10(n);
        sc.close();
    }
}
