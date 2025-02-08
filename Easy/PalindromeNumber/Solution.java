class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
