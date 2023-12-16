class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // This concept is to that of the cieling number
        // Ignore the character to the number we are finding
        // Here no need to check for the == check
        // here we need to implement the wrap concept that is if the character does not
        // xit as an output we'll give the alphabet on the 0th index
        // the start and the end will both be on the last index
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }

        }
        return letters[start % letters.length];
    }
}