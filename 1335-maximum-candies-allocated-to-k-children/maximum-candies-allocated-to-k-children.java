class Solution {
    public int maximumCandies(int[] candies, long k) {
        long totalCandies = 0;
        for (int c : candies) totalCandies += c;
        if (totalCandies < k) return 0;

        int low = 1, high = 0;
        for (int c : candies) high = Math.max(high, c);
        
        while (low < high) {
            int mid = (low + high + 1) / 2;
            long count = 0;
            for (int c : candies) count += c / mid;
            if (count >= k) low = mid;
            else high = mid - 1;
        }
        return low;
    }
}
