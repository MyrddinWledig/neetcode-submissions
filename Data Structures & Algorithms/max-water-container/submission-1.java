class Solution {
    public int maxArea(int[] heights) {
        int area = 0, i = 0, j = heights.length-1;

        while(i<j)
        {
            int curArea = (j-i)*(Math.min(heights[i], heights[j]));
            area = Math.max(curArea, area);
            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return area;
    }
}
