/* 1234
   123
   12
   1 */
package patterns;
import java.util.*;
public class Pattern6{
    public void pattern6(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
        Pattern6 p6=new Pattern6();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number:");
        n=sc.nextInt();
        p6.pattern6(n);
    }
}