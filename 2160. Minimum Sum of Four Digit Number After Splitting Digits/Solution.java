class Solution {
    public int minimumSum(int num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        // int ans =  ((chars[0])*10+(chars[1])*10+(chars[2])+(chars[3]));
        int ans = Integer.parseInt(String.valueOf(chars[0])) * 10 + Integer.parseInt(String.valueOf(chars[3])) + 
                  Integer.parseInt(String.valueOf(chars[1])) * 10 + Integer.parseInt(String.valueOf(chars[2]));
        return ans;
    }
}