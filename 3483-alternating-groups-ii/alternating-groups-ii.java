class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        if (k > n) return 0; 
        
        int count = 0, validGroups = 0;
        
        for (int i = 0; i < k - 1; i++) {
            if (colors[i] != colors[i + 1]) validGroups++;
        }
        
        if (validGroups == k - 1) count++;

        for (int i = 1; i < n; i++) {
            if (colors[(i - 1) % n] != colors[i % n]) validGroups--;
            if (colors[(i + k - 2) % n] != colors[(i + k - 1) % n]) validGroups++;

            if (validGroups == k - 1) count++;
        }
        
        return count;
    }
}
