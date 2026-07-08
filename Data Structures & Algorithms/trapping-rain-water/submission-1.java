class Solution {
    public int trap(int[] height) {
        /* BF : water at i-th place= min(lmax-i,rmax-i) - h[i];
        taek two array lmax and rmax and then their minimum and store value;

        Optimal : two pointer L & R and keep calculating at the smaller side as it would hold water.
        */

        int n = height.length;
        int [] l = new int [n];
        int [] r = new int [n];

        int total = 0;

        l[0] = height[0];
        for(int i = 1; i<n; i++){
            l[i] = Math.max(l[i-1], height[i]);
        }

        r[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            r[i] = Math.max(r[i+1], height[i]);
        };

        for(int i = 0; i<n; i++){
            if(height[i] < l[i] && height[i] < r[i])
            total += Math.min(l[i], r[i]) - height[i];
        }

        return total;
    }
}
