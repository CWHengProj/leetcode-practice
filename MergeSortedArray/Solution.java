import java.util.Arrays;
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //moves all the variables to nums1
        int length = m+n;
        int z=0;
        for (int x=m; x<length; x++){
            nums1[x]=nums2[z];
            z++;
        }
        Arrays.sort(nums1);;        
    }
}