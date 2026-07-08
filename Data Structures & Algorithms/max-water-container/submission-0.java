class Solution {
    public int maxArea(int[] heights) {
        /*
        TP = l, r and move with a max element 
        */

        int l = 0;
        int r = heights.length - 1;

        int max = 0;

        while(l < r){
            System.out.println(l);
            int vol = Math.min(heights[l],heights[r]) * (r-l);
            max = Math.max(vol, max);

            

            if(heights[l] <= heights[r]) l++;
            else r--;
        }

        return max;
    }
}
