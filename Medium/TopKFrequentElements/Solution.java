import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int i: nums) f.put(i, f.getOrDefault(i, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer, Integer> e : f.entrySet()){
            pq.offer(e);
            if (pq.size() > k) pq.poll();
        }
        int[] r = new int[k];
        for (int i = k-1; i >= 0; i--) r[i] = pq.poll().getKey();
        return r;
    }
}
