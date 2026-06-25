import java.util.Arrays;

public twopointer{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // left pointer non-zero varikum move pannum
            while (left < right && arr[left] != 0) {
                left++;
            }

            // right pointer zero varikum move pannum
            while (left < right && arr[right] == 0) {
                right--;
            }

            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
