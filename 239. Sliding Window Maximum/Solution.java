class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // int[] result = new int[nums.length - k + 1];
        // int index = 0;
        // ArrayDeque<Integer> window = new ArrayDeque();

        // for(int i = 0; i < k; i++) {
        // window.addLast(nums[i]);
        // }

        // for(int i = k; i < nums.length + 1; i++) {
        // result[index++] = Collections.max(window);
        // if (i < nums.length) {
        // window.addLast(nums[i]);
        // window.removeFirst();
        // }
        // }
        // return result;

        int n = nums.length;
        if (n == 0 || k == 0)
            return new int[0];

        int[] result = new int[n - k + 1];
        int index = 0;
        ArrayDeque<Integer> window = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            cleanDeque(window, nums, i, k);
            window.addLast(i);
        }
        result[index++] = nums[window.getFirst()];

        for (int i = k; i < n; i++) {
            cleanDeque(window, nums, i, k);
            window.addLast(i);
            result[index++] = nums[window.getFirst()];
        }

        return result;

    }

    private void cleanDeque(ArrayDeque<Integer> window, int[] nums, int i, int k) {
        if (!window.isEmpty() && window.getFirst() == i - k)
            window.removeFirst();

        while (!window.isEmpty() && nums[i] >= nums[window.getLast()])
            window.removeLast();
    }
}