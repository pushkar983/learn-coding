class Solution {
    public String mergeAlternately(String word1, String word2) {
       int l1 = 0;
       int l2 = 0;
       String str = "";
       while(l1<word1.length() && l2<word2.length()){
        str+=word1.charAt(l1++);
        str+=word2.charAt(l2++);
       } 

        while(l2<word2.length()){
        
        str+=word2.charAt(l2++);
       } 

        while(l1<word1.length() ){
        str+=word1.charAt(l1++);
        
       } 

       return str;
    }
}