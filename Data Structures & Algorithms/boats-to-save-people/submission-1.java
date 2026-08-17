class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int max = people.length;

        Arrays.sort(people);

        int l = 0;
        int r = max - 1;

        int count = 0;

        while(l<r){
            int total = people[l] + people[r];
            if(total <= limit){
                count++;
                l++;
                r--;
            } else if (total > limit) r--;
            else {
                count++;
                l++;
            }
        }

        return count == 0 ? max : (max-count);
    }
}