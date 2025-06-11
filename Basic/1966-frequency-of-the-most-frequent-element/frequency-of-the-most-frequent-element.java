import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Sort so we can work with increasing order
        int left = 0;
        long total = 0;
        int maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // Total operations needed to make all elements from left to right equal to nums[right]
            long needed = (long) nums[right] * (right - left + 1);

            // If we need more than k operations, shrink the window
            while (needed - total > k) {
                total -= nums[left];
                left++;
                needed = (long) nums[right] * (right - left + 1);
            }

            // Update the max frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
