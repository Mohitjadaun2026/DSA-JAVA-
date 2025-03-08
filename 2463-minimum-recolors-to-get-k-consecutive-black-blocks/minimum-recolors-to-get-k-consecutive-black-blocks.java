class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;  
        
        for (int i = 0; i <= blocks.length() - k; i++) {  
            int countW = 0;
            
            for (int j = i; j < i + k; j++) {  
                if (blocks.charAt(j) == 'W') {
                    countW++;
                }
            }
            
            min = Math.min(min, countW);
        }
        
        return min;
    }
}
