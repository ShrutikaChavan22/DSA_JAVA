/* *
   * *
   * * *
   * * * *
   * * * * *    */
import java.util.*;
public class Pattern2{
    public void pattern2(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
        Pattern2 p2=new Pattern2();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number:");
        n=sc.nextInt();
        p2.pattern2(n);
    }
}