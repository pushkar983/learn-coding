class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        Imagine anumber line + use set to store all numbers + check if the number is the starting point
        of a sequence -> (check if there is a samller number, number to the left exists)
        if not -> move on;
        */

        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int streak = 0;
        int res = 0;
        for(int i : nums){
            if(set.contains(i-1)){
                continue;
            } else {
                streak++;
                while(set.contains(i+1)){
                    i++;
                    streak++;
                }
                res = Math.max(streak, res);
                streak = 0;
            }
        }
        return res;
    }
}
