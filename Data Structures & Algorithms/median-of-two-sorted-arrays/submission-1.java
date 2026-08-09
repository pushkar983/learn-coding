class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = 0;
        int l2 = 0;
        int k = 0;

        double ele1 = -1;
        double ele2 = -1;

        int n1 = nums1.length;
        int n2 = nums2.length;

        int size = n1+n2;
        int idx1 = (size/2) - 1;
        int idx2 = size/2;
    
        while(l1<n1 && l2<n2){
            if(nums1[l1] >= nums2[l2]){
                if(k == idx1) ele1 = nums2[l2];
                if(k == idx2) ele2 = nums2[l2];
                l2++;
            } else {
                if(k == idx1) ele1 = nums1[l1];
                if(k == idx2) ele2 = nums1[l1];
                l1++;
            }
            k++;
        }

        while(l1<n1){
            if(k == idx1) ele1 = nums1[l1];
            if(k == idx2) ele2 = nums1[l1];
            l1++;
            k++;
        }

        while(l2<n2){
            if(k == idx1) ele1 = nums2[l2];
            if(k == idx2) ele2 = nums2[l2];
            l2++;
            k++;
        }

         
          if (size % 2 == 0) {
              return (ele1+ele2) / 2.0;
          } 
          return ele2;
    }
}
