class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map<Integer, Integer> map = new HashMap<>();
       for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

         return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
