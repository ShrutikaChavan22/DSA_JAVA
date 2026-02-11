// 1
// 0 1
// 1 0 1
// 0 1 0 1
package patterns;
import java.util.*;
public class Pattern11{
    public void pattern11(int n){
        for(int i=0;i<=n;i++){
            int start=1;
            if(i%2==0)
                start=0;
            else
                start=1;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
        System.out.println("");
    }
    public static void main(String args[]){
        Pattern11 p11 = new Pattern11();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p11.pattern11(n);
        sc.close();
    }
}