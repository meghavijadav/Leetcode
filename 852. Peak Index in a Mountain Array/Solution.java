class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end= arr.length -1;

        while (start < end){
            //find the middle element
            //int mid = (start + end)/2;
            //now the problem is that int has a fixed size hence it may happen that 'start+end' may exceed the range of java
            //so the better way to do this is
            int mid = start + (end - start)/2;

            if( arr[mid] > arr[mid + 1]){
                //you are in the decending part of the array
                //So it means this could be the potential answer but look left
                //end != mid - 1;
                end = mid;
            } else {
                //you are in the ascending part of the array
                // we know mid+1 > mid element
                start = mid + 1;
            }
        }
        //in the end start == end 

        return start;
    }
}