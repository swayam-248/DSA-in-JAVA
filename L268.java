public class L268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        L268 obj = new L268();
        int[] nums = {3, 0, 1};
        int result = obj.missingNumber(nums);
        System.out.println("Missing number is: " + result);
    }
}
