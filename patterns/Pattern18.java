// E 
// D E 
// C D E 
// B C D E 
// A B C D E 
package patterns;
import java.util.*;

public class Pattern18 {
    public void pattern18(int n) {
        char lastChar = (char) ('A' + n - 1);  
        for (int i = 0; i < n; i++) {  
            for (char ch = (char) (lastChar - i); ch <= lastChar; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Pattern18 p18 = new Pattern18();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        p18.pattern18(n);
        sc.close();
    }
}
