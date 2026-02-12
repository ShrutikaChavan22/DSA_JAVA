// A
// ABA
// ABCBA
// ABCDCBA
// ABCDEDCBA
// ABCDEFEDCBA
package patterns;
import java.util.*;
public class Pattern17{
    public void pattern17(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){           
                System.out.print("");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){           
                System.out.print(ch+"");
                if(j<=breakpoint) ch++;
                else ch--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("");
            }
            System.out.println("");
        }
        
    }
    public static void main(String args[]){
        Pattern17 p17= new Pattern17();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p17.pattern17(n);
        sc.close();
    }
}