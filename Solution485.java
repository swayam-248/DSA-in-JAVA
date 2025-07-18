public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int streak = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                streak++;
                maxcount = Math.max(streak, maxcount);
            } else {
                streak = 0;
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        Solution485 sol = new Solution485();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Max consecutive 1's: " + sol.findMaxConsecutiveOnes(nums));
    }
}
