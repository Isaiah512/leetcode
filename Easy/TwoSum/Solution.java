import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if (numsMap.containsKey(num)) return new int[] {numsMap.get(num), i};
            numsMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
