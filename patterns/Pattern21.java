// * * * * 
// *    *
// *    *
// * * * *
package patterns;
import java.util.*;
public class Pattern21 {
    public void pattern21(int n) {
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
          }
        }
    public static void main(String args[]) {
        Pattern21 p21 = new Pattern21();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        p21.pattern21(n);
        sc.close();
    }
}
