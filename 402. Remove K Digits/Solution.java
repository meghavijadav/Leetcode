class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int remain = num.length() - k;

        for (char c : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char digit : stack.subList(0, remain)) {
            sb.append(digit);
        }

        String result = sb.toString().replaceFirst("^0+(?!$)", "");
        return result.isEmpty() ? "0" : result;
    }
}