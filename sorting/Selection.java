package sorting;
import java.util.*;
public class Selection {
    public void Selection_sort(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini])
                    mini=j;
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }                                                                   //13 67 34 23 100
    public static void main(String[] args) {
        Selection s1=new Selection();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        s1.Selection_sort(arr,n);
        System.out.println("Sorted array elements are:");
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
        }
    }
    
}
