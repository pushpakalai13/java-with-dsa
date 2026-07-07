import java.util.Arrays;

public class merge {

    // Merge Sort Method
    static void mergeSort(int arr[], int low, int high) {

        // Base Case
        if (low >= high) {
            return;
        }

        // Find Middle
        int mid = (low + high) / 2;

        // Sort Left Half
        mergeSort(arr, low, mid);

        // Sort Right Half
        mergeSort(arr, mid + 1, high);

        // Merge Both Halves
        merge(arr, low, mid, high);
    }

    // Merge Method
    static void merge(int arr[], int low, int mid, int high) {

        int temp[] = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        // Compare elements
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        // Copy remaining left elements
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining right elements
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy temp back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {

        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        // Variables declare pannrom
        int low = 0;
        int high = arr.length - 1;

        // Variables pass pannrom
        mergeSort(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }
}