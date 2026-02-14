package sorting;
import java.util.*;
public class InsertionSort{
    public void Insertion_Sort(int arr[],int n){
        for(int i=0;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }

    }
    public static void main(String args[]){
        InsertionSort i1=new InsertionSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        i1.Insertion_Sort(arr,n);
        System.out.println("Sorted array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}