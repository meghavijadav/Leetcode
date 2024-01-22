class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] frequency = new int[101];

        int goodPairsCount = 0;
        for (int num : nums) {
            frequency[num]++;
        }
        for (int count : frequency) {
            // If there are n occurrences of a number, then n * (n - 1) / 2 pairs can be
            // formed
            goodPairsCount += (count * (count - 1)) / 2;
        }
        return goodPairsCount;
    }
}