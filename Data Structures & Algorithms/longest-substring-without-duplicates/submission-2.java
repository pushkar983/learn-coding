class Solution {
    public int lengthOfLongestSubstring(String s) {
         int l = 0;
         int max = 0;
         Set<Character> set = new HashSet<>();

         for(int r = 0; r<s.length(); r++){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            max = Math.max(set.size(), max);
         }

         return max;
    }
}
