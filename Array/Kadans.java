package Array;

public class Kadans {
    public static int maxSum(int arr[], int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += arr[i];
            if (sum > max) {
                max = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return max;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}
