class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
         * Looking into example 1
         * Approach-
         * -here value of m and n is equal to 3
         * -We basically need to put the larger elements at the end.
         * -So we will try replace the zeros with larger numbers.
         * -And for this we will take two pointers 'i' and 'j' resp. for nums1 and nums2
         * -i and j will point at the last elements of their respective array
         * -then we will compare the the values of i and j. we know 3 < 6 so new array
         * is-
         * 1. nums1 = [1,2,3,0,0,6], 6 will be placed on the kth position
         * 2. nums1 = [1,2,3,0,5,6], 3<5
         * 3. nums1 = [1,2,3,3,5,6], 3>2
         * 4. nums1 = [1,2,2,3,5,6], 2>2
         * -run the loop only till j,i >=0
         */

        int i = m - 1; // last element of nums1
        int j = n - 1; // last element of nums2
        int k = m + n - 1; // last element of new nums1

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                // whichever is greater will go to the kth position
                nums1[k] = nums1[i];
                k--;
                i--; // whichever is greater goes to one position behind as we started from behind
            }

            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}