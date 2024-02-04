class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false; // This is when the poistion you are at right now is not reachable
            }
            max = Math.max(max, i + nums[i]); // Updatng to the new position

            if (max >= nums.length - 1) {
                return true; // This is when the max reachable place >= the last index
            }
        }
        return false;
    }
}