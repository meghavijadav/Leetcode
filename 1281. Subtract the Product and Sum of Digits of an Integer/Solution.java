class Solution {
    public int subtractProductAndSum(int n) {
        int remainder;
        int product = 1;
        int sum = 0;
        int ans;
        while (n != 0) {
            remainder = n % 10;
            // This will give each individual digits. For example if you tak 27.
            // Then 27%10 is 7 which is the digit in units place itself

            product = product * remainder;
            sum = sum + remainder;
            n = n / 10;
        }
        ans = product - sum;
        return ans;
    }
}
