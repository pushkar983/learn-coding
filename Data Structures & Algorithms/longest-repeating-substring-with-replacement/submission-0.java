class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        int maxF = 0;
        int max = 0;
        for(int r = 0; r<s.length(); r++){
            char rch = s.charAt(r);
            map.put(rch, map.getOrDefault(rch, 0)+1);

            maxF =  Math.max(maxF, map.get(rch));

            while((r-l+1) - maxF > k){
                char lch = s.charAt(l);
                map.put(lch, map.get(lch)-1);
                l++;
            }

            max = Math.max(max, (r-l+1));
        }
        return max;
    }
}
