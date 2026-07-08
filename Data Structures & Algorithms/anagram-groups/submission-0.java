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
}
