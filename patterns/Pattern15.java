// A B C D E
// A B C D
// A B 
// A 
package patterns;
import java.util.*;
public class Pattern15{
    public void pattern15(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<'A'+(n-i-1);ch++){
                 System.out.print(ch+"");
            }
            System.out.println("");
        }
        
    }
    public static void main(String args[]){
        Pattern15 p15= new Pattern15();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p15.pattern15(n);
        sc.close();
    }
}