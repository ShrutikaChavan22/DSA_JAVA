package sorting;
import java.util.*;

public class RecursiveBubbleSort {

    public void bubbleSort(int arr[], int n) {
       
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        RecursiveBubbleSort b1 = new RecursiveBubbleSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        b1.bubbleSort(arr, n);

        System.out.println("Sorted array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
