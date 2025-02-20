class Solution {
    public void rotate(int[] nums, int k) {
        int a = k % nums.length;
        // reverse the array
        reverse(nums, 0, nums.length - 1);
        // reverse the first a elements
        reverse(nums, 0, a - 1);
        // reverse the remaining
        reverse(nums, a, nums.length - 1);
    }

    void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    } 
}
