class Solution {
    public int heightChecker(int[] heights) {
        int[] heights2 = new int[heights.length];
        for(int i=0; i<heights.length;i++){
            heights2[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i=0; i<heights.length;i++){
            if(heights[i] != heights2[i])
                count++;
        }
        return count;
    }
}