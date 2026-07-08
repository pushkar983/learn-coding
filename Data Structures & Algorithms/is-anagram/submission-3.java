class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int [] arr = new int [26];
        Arrays.fill(arr, 0);
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            char c = t.charAt(i);
            arr[ch - 'a']++;
            arr[c - 'a']--;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0)
                return false;
        }

        return true;
    
    }
}
