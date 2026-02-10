/* 1 
   2 2
   3 3 3
   4 4 4 4 */
import java.util.*;
public class Pattern4{
    public void pattern4(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
        Pattern4 p4=new Pattern4();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number:");
        n=sc.nextInt();
        p4.pattern4(n);
    }
}