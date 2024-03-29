class Solution {
    public int[] shuffle(int[] nums, int n) {
        n = nums.length / 2;
        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }
        return result;
    }
}