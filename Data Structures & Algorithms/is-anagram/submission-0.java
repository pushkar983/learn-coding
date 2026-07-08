class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            mapA.put(s.charAt(i), mapA.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i<t.length(); i++){
                mapB.put(t.charAt(i), mapB.getOrDefault(t.charAt(i), 0)+1);
        }

        return mapA.equals(mapB);

    }
}
