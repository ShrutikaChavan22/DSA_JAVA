/* 1 
   1 2
   1 2 3
   1 2 3 4 */
import java.util.*;
public class Pattern3{
    public void pattern3(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j );
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
        Pattern3 p3=new Pattern3();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number:");
        n=sc.nextInt();
        p3.pattern3(n);
    }
}