class Solution {
    public int minCapability(int[] nums, int k) {
        int low = 0, high = 0;
        for (int num : nums) high = Math.max(high, num);
        
        while (low < high) {
            int mid = (low + high) / 2, count = 0, prev = -2;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid && prev + 1 < i) {
                    count++;
                    prev = i;
                }
            }
            if (count >= k) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
