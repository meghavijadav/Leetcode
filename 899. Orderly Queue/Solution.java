class Solution {
    public String orderlyQueue(String s, int k) {
        StringBuilder res = new StringBuilder(s);

        if (k == 1) {
            int l = s.length();
            for (int i = 0; i < l; i++) {
                char c = s.charAt(0);
                s = s.substring(1, l) + c;
                if (s.compareTo(res.toString()) < 0)
                    res = new StringBuilder(s);
            }
            return res.toString();
        }

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}