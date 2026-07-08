class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int [] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        for(int i = 0; i<s.length(); i++){
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }

        for(int i : alphabets){
            if(i != -1)
                return false;
        }

        return true;
    }
}
