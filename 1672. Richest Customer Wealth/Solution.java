class Solution {
    public int maximumWealth(int[][] accounts) {
        // person = row and account = col
        // It will check the sum for every row.
        // If the sum of the row is greater than the previous sum then this value will
        // be stored as the max value
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col,take a sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // When you come out of this loop. Now you'll have sum of accounts of person
            // Now we will check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
