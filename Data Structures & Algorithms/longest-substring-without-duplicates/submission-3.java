class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character, Integer> map = new HashMap<>();
       int max = 0;
       int st = 0;

       for(int e = 0; e<s.length(); e++){
        char eChar = s.charAt(e);
        map.put(eChar, map.getOrDefault(eChar,0)+1);

        while(map.get(eChar) > 1){
            char sChar = s.charAt(st);
            map.put(sChar, map.get(sChar)-1);
            st++;
        }

        max = Math.max(max, e-st+1);
       }

       return max; 
    }
}
