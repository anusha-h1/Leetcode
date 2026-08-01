class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }

        return res.equals(s);
    }
}