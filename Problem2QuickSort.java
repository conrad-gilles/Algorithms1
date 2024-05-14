package HW2;
import java.util.Arrays;

public class Problem2QuickSort {

    public static void main(String[] args) {
    int[] arr = {5, 19, 2, 11, 8, 7, 4, 10, 16, 2};
    quickSort(arr, 0, arr.length - 1);
    System.out.println("Sorted array-> " + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int small, int big) {
    if (small < big) {
        int par = partition(arr, small, big);
        quickSort(arr, small, par - 1);
        quickSort(arr, par + 1, big);
    }
    }
public static int partition(int[] arr, int low, int high) {
    int piv = arr[high];
    int b = (low - 1);
    for (int a = low; a < high; a++) {
        if (arr[a] <= piv) {
            b++;
             change(arr, b, a);
         }
     }
    change(arr, b + 1, high);
    return b + 1;
    }
    public static void change(int[] arr, int c, int d) {
        int var = arr[c];
        arr[c] = arr[d];

        arr[d] = var;
    }
}
