class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(nums.length);
        for(int i : nums){
            if(!seen.add(i))
                return true;
        }

        return false;
    }
}