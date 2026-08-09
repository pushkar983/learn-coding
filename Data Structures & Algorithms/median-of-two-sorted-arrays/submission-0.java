class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = 0;
        int l2 = 0;
        int k = 0;

        double ans = 0;

        int n1 = nums1.length;
        int n2 = nums2.length;

        int res [] = new int [n1+n2];

        while(l1<n1 && l2<n2){
            if(nums1[l1] >= nums2[l2]){
                res[k++] = nums2[l2++];
            } else {
                res[k++] = nums1[l1++];
            }
        }

        while(l1<n1){
            res[k++] = nums1[l1++];
        }

        while(l2<n2){
            res[k++] = nums2[l2++];
        }

         int len = res.length;
          if (len % 2 == 0) {
              return (res[len / 2 - 1] + res[len / 2]) / 2.0;
          } else {
              return res[len / 2];
          }
    }
}
