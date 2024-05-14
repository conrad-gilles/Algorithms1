package HW2;
import java.util.Arrays;

public class Problem1HeapSort {

    public static void main(String[] args) {
        int[] arr = {5, 19, 2, 11, 8, 7, 4, 10, 16, 2};
        heapSort(arr);
        System.out.println("Sorted arr->" + Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        int arrLen = arr.length;
        buildMaxHeap(arr, arrLen);
for (int i = arrLen - 1; i > 0; i--) {
        swap(arr, 0, i);
        maxHeapify(arr, 0, i);
        }
    }

 public static void buildMaxHeap(int[] arr, int var) {
        for (int i = var / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, var);
        }
    }

    public static void maxHeapify(int[] arr, int var2, int siyeOfHeap) {
    int biggest = var2;
    int L = 2 * var2 + 1;
    int R = 2 * var2 + 2;

    if (L < siyeOfHeap && arr[L] > arr[biggest]) {
    biggest = L;
    }
    if (R < siyeOfHeap && arr[R] > arr[biggest]) {
            biggest = R;
    }

    if (biggest != var2) {
            swap(arr, var2, biggest);
            maxHeapify(arr, biggest, siyeOfHeap);
        }
    }

    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
}
