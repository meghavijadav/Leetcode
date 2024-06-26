class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(word[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(word[right]) == -1) {
                right--;
            }

            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;

            left++;
            right--;
        }

        return new String(word);
    }
}