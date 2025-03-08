class Solution {
    public int minimumRecolors(String blocks, int k) {
        int countW = 0, minW;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') countW++;
        }

        minW = countW;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') countW--;
            if (blocks.charAt(i) == 'W') countW++;
            minW = Math.min(minW, countW);
        }

        return minW;
    }
}
