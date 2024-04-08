

public class Main {
    public static int shortestSpecialSubarray(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;

        // Iterate through the array
        for (int left = 0; left < n; left++) {
            int currOr = 0; // Reset current bitwise OR for each left pointer

            // Iterate through the array with a new left pointer
            for (int right = left; right < n; right++) {
                // Update current bitwise OR with the new element
                currOr |= nums[right];

                // If the current OR is greater than or equal to k, update minLength and break the loop
                if (currOr >= k) {
                    minLength = Math.min(minLength, right - left + 1);
                    break;
                }
            }
        }

        return minLength != Integer.MAX_VALUE ? minLength : -1;
    }

    public static void main(String[] args) {
        int[] nums = {16, 1, 2, 20, 32};
        int k = 45;
        System.out.println(shortestSpecialSubarray(nums, k)); // Output: 5
    }
}