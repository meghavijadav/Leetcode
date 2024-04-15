class Solution {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int prev = 0;
        for (String line : bank) {
            int count = 0;
            for (char c : line.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            if (count != 0) {
                result += prev * count;
                prev = count;
            }
        }
        return result;
    }
}