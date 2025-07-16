public class L1752 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        L1752 checker = new L1752();

        int[] test1 = {3, 4, 5, 1, 2};
        System.out.println(checker.check(test1));  // output will be true

        int[] test2 = {2, 1, 3, 4};
        System.out.println(checker.check(test2));  // output will be false

        int[] test3 = {1, 2, 3};
        System.out.println(checker.check(test3));  // output will be true 
    }
}
