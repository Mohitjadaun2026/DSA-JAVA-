class Solution {
    public int[] applyOperations(int[] nums) {
        int i = 0, n = nums.length - 1;

        while (i < n) {
            if (nums[i] != nums[i + 1]) {
                i++;
            } else {
                nums[i] *= 2;
                nums[i + 1] = 0;
                i++;
            }
        }

        int j = 0; 
        for (i = 0; i <= n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}
