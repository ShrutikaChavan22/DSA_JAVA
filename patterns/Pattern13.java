// 1
// 2 3
// 4 5 6
// 7 8 9 10
package patterns;
import java.util.*;
public class Pattern13{
    public void pattern11(int n){
        int num=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                 System.out.print(num);
                 num=num+1;
            }
            System.out.println("");
        }
        
    }
    public static void main(String args[]){
        Pattern13 p13 = new Pattern13();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p13.pattern11(n);
        sc.close();
    }
}