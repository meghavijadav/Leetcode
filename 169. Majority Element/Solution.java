class Solution {
    public int majorityElement(int[] nums) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                k = nums[i];
            }
            if (k == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return k;
    }
}