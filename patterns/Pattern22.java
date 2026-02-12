// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4
package patterns;
import java.util.*;

public class Pattern22 {

    private int min(int a, int b) {
        return Math.min(a, b);
    }

    public void pattern22(int n) {
        int size = 2 * n - 1; 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int down = size - 1 - i;

                int val = n - min(min(top, down), min(left, right));
                System.out.print(val + " "); 
            }
            System.out.println(); 
        }
    }

    public static void main(String args[]) {
        Pattern22 p22 = new Pattern22();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        p22.pattern22(n);
        sc.close();
    }
}
