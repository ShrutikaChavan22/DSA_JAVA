package sorting;
import java.util.*;
public class BubbleSort {
    public void Bubble_Sort(int arr[],int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                     int temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                }
            }
            
        }
    }                                                                   
    public static void main(String[] args) {
        BubbleSort b1=new BubbleSort();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        b1.Bubble_Sort(arr,n);
        System.out.println("Sorted array elements are:");
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
        }
    }
    
}
