class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;

        int max = 0;

        while(l<r){
            int min = Math.min(heights[l], heights[r]);
            int water = (r-l)*min;

            max = Math.max(water, max);
            if(heights[l] >= heights[r]){
                r--;
            } else l++;
        }

        return max;
    }
}
