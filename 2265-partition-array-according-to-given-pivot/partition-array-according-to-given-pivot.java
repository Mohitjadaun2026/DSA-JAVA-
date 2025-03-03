class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int j = 0;
        int n = nums.length;
        int[] result = new int[n];

        for (int num : nums) {
            if (num< pivot) {
                result[j++] = num;
            }

        }

        for (int num : nums) {
            if (num== pivot) {
                result[j++] = num;
            }

        }

        for (int num : nums) {
            if (num> pivot) {
                result[j++] = num;
            }

        }

        return result;

    }
}