class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // Approach
        // start with 0
        // ++X and X++ increments the value of the variable X by 1.
        // --X and X-- decrements the value of the variable X by 1.

        int count = 0;

        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                count++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                count--;
            }
        }

        return count;

    }
}
