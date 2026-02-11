// A
// A B
// A B C
// A B C D
package patterns;
import java.util.*;
public class Pattern14{
    public void pattern14(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<'A'+i;ch++){
                 System.out.print(ch+"");
            }
            System.out.println("");
        }
        
    }
    public static void main(String args[]){
        Pattern14 p14= new Pattern14();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p14.pattern14(n);
        sc.close();
    }
}