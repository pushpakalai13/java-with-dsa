public class slidingwindow {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 5};
        int k = 3;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
