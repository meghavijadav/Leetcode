//Leetcode Question- https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Google Question

import java.util.ArrayList;
import java.util.List;

class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // [1, n] is enough to know we need to use cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}