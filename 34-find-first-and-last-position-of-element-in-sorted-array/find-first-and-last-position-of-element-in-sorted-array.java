class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

      
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }


    private int lowerBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1, ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1, ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
        }
}