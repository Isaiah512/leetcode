import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c: s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (freq.get(c) == 1) return i;
        }
        return -1;
    }
}
