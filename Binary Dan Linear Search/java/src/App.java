import java.util.Arrays;

public class App {
    public static int binarySearch(int[] arr, int input) {
        int a = 0;
        int b = arr.length - 1;
        while (a <= b) {
            int c = (a + b) / 2;
            if (arr[c] == input) {
                return c;
            } else if (arr[c] < input) {
                a = c + 1;
            } else {
                b = c - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int input) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                return i;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 88, 20, 98, 23, 87, 44, 100, 45, 77, 82, 123, 333 };
        int input = 333;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Binary: " + binarySearch(arr, input));
        System.out.println("Linear: " + linearSearch(arr, input));
    }
}
