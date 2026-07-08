class Solution {
    public int maxProfit(int[] prices) {
/* BF : right max sell - left min buy 
*/

        int n = prices.length;
        
        int [] l = new int [n];
        int [] r = new int [n];

        l[0] = prices[0];
        r[n-1] = prices[n-1];
        
        for(int i = 1; i<n; i++){
            l[i] = Math.min(l[i-1], prices[i]);
        }

        for(int i = n-2; i>=0; i--){
            r[i] = Math.max(r[i+1], prices[i]);
        }

        int max = 0;

        for(int i = 0; i<n; i++){
            max = Math.max(r[i]-l[i], max);
        }

        return max;
    }
}
