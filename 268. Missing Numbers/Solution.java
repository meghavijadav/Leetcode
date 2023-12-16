//Leetcode Question- https://leetcode.com/problems/missing-number/
//Amazon Question
class Solution {
    public int missingNumber(int[] nums) {
        //[0, n],  O(1) extra space complexity and O(n) runtime complexity
        // These are the hints that you need to use Cyclic Sort

        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i , correctIndex);
            }else {
                i++;
            }
        }

        //Search for the first missing number now
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return index;
            }

        }

        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}    