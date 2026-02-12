// A
// B B 
// C C C
// D D D D
package patterns;
import java.util.*;
public class Pattern16{
    public void pattern16(int n){
        for(int i=1;i<=n;i++){
            char ch = (char) ('A' + i - 1);
            for(int j=1;j<=i;j++){           
                System.out.print(ch+"");
            }
            System.out.println("");
        }
        
    }
    public static void main(String args[]){
        Pattern16 p16= new Pattern16();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        p16.pattern16(n);
        sc.close();
    }
}