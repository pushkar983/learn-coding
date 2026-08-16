class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            char lch = s.charAt(l);
            char rch = s.charAt(r);

            if(Character.isLetterOrDigit(lch) && Character.isLetterOrDigit(rch)){
                if(Character.toLowerCase(lch) == Character.toLowerCase(rch)){
                    l++;
                    r--;
                } else
                    return false;
            } else if(!Character.isLetterOrDigit(lch)) l++;
            else r--;
        }

        return true;
    }
}
