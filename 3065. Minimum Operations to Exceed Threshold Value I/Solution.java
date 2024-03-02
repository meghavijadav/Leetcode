class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ops = 0;
        while (nums[0] < k) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[0]) {
                    nums[i] = Integer.MAX_VALUE;
                    ops++;
                    break;
                }
            }
            Arrays.sort(nums);
        }
        return ops;
    }
}