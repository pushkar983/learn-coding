class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> group = new HashMap<>();

        for(String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(s); 
        }

        return new ArrayList<>(group.values());
    }

    /*
    n = no of strings
    m = length of strings

    sort = mlogm * n (no of strings)
    Hashmap insert/lookup = O(1)

    T = O(nmlogm)

    S = O(n*m) 
    */
}
