package sorting;
import java.util.*;

public class RecursiveInsertionSort {
    public void insertionSort(int arr[], int n) {
        if (n <= 1) {
            return;
        }
        insertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String args[]) {
        RecursiveInsertionSort i1 = new RecursiveInsertionSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        i1.insertionSort(arr, n);

        System.out.println("Sorted array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
