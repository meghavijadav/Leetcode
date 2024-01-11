class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //approach 
        //merge the two arrays nums1 and nums2 and sort it
        //apply median formula to find the median 
        //median should have the datatype of double

         int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);

        // Find the median
        int n = mergedArray.length;
        if (n % 2 == 0) {
            // If the length is even, take the average of the middle two elements
            int mid1 = mergedArray[n / 2 - 1];
            int mid2 = mergedArray[n / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            // If the length is odd, return the middle element
            return (double) mergedArray[n / 2];
        }
    }
}