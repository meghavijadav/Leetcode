class Solution {
    public int removeDuplicates(int[] nums) {

        /*
         * Approach
         * -so we have a sorted array and we need to make sure that no unique element is
         * repeated more than once.
         * -so if we start from behind and there are three 1's in the element, if the
         * first one is i then last one will be i-2
         * - if num[i] = num [i-2] then it is a duplicate.
         * - so if the array is {0,0,1,1,1,1,2,2,2,3}
         * - so if i is at the third idex i.e is 1 and i-2 will be at first index i.e 0,
         * they are not the same so we move ahead
         * - now when to move to the next index both fourth and second index will be 1
         * hence it is a dulicate.
         * - so now you will skip that element till you find two different elements.
         * - when we will continue this process we will get {0,0,1,1,2,2,3} as the new
         * array.
         */

        int i = 0;
        for (int n : nums) // for each element in nums
        {
            if (i < 2 || n != nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}