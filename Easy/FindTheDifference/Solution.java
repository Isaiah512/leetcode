class Solution {
    public char findTheDifference(String s, String t) {
        char r = 0;
        for (char c: s.toCharArray()) r ^= c;
        for (char c: t.toCharArray()) r ^= c;
        return r;
    }
}
