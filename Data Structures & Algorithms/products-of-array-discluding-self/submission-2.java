class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x = 1;
        int [] a = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            a[i] = x;
            x*=nums[i];
        }

        x = 1;

        for(int i = nums.length-1; i>=0; i--){
            a[i]*=x;
            x*=nums[i];
        }

        return a;
    }
}  
