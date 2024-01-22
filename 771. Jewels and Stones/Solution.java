class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // take the first jewel that is on index 0 and count the number of times it
        // occurs in stones
        // now increment the counter everytime you find that character
        // now move to the next one in jewel and increase the counter every time you
        // find it in the stones
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);

            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewel) {
                    count++;
                }
            }
        }

        return count;
    }
}