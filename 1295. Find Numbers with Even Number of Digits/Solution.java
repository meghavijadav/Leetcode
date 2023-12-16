class Solution {
    public int findNumbers(int[] nums) {
        // Approach- lets say we take nums = [18,124,9,1764,98,1] so we know the answer
        // should be three as there are three numbers with three digits respectively
        // How can we check if the number contains even number of digits? Let us take
        // 1764
        // We can simply count the number of digits or convert 1764 into string and
        // check the length

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits1(int num) {
        return (int) (Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
