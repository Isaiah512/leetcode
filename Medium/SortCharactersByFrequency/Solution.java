import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> fm = new HashMap<>();
        for (char c: s.toCharArray()) fm.put(c, fm.getOrDefault(c, 0) + 1);
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(fm.entrySet());
        Collections.sort(entries, (a,b) -> {
            int cmp = b.getValue().compareTo(a.getValue());
            if (cmp != 0){
                return cmp;
            }else{
                return a.getKey().compareTo(b.getKey());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry: entries){
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) sb.append(c);
        }
        return sb.toString();
    }
}
