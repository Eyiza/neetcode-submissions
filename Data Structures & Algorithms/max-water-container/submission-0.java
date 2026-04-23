class Solution {
    public int maxArea(int[] heights) {
        if (heights.length == 0) return 0;
        int maxArea = 0;
        int i = 0;
        int j = heights.length - 1;

        while (i < j){
            int area = Math.min(heights[i], heights[j]) * (j - i);
            maxArea = Math.max(maxArea, area);

            if (heights[i] > heights[j]) j--;
            else i++;
        }

        return maxArea;
    }
}
