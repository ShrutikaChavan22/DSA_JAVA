/* ****
   ***
   **
   * */
package patterns;
import java.util.*;
public class Pattern5{
    public void pattern5(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
        Pattern5 p5=new Pattern5();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number:");
        n=sc.nextInt();
        p5.pattern5(n);
    }
}