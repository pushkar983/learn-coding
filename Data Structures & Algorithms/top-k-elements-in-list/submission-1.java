class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] a = new int[k];
        int l = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet().stream(
            ).sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder()))
            .limit(k)
            .collect(Collectors.toList())
        ){
            a[l++] = e.getKey();
        }

        return a;
    }

    /*
    TC = sort -> nlogn -> worst case if all elements are distinct(n)
    SC = O(n) + O(k)(output array)
    */
}
