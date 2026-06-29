public class pivotindex {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 8, 7, 3};

        int index = pivotIndex(arr);

        if (index != -1) {
            System.out.println("Pivot Index = " + index);
            System.out.println("Pivot Value = " + arr[index]);
        } else {
            System.out.println("No Pivot Index");
        }
    }
}