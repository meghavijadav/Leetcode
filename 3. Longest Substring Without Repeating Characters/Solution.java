class Solution {
    public int lengthOfLongestSubstring(String s) {
        // start the counter with 1
        // whenever you see n = n + 1 store the value of counter and resent it to one
        // and start counting from n+1 again
        // also stop the counter if the character is already part of the substring
        // whichever value of counter is maximum return that

        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}