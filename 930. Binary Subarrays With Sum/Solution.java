class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumFreq = new HashMap<>();
        
        for (int num : nums) {
            sum += num;
            if (sum == goal) {
                count++;
            }
            if (sumFreq.containsKey(sum - goal)) {
                count += sumFreq.get(sum - goal);
            }
            sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}