class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //moves all the variables to nums1
        int length = m+n;
        int z=0;
        for (int x=m; x<length; x++){
            nums1[x]=nums2[z];
            z++;
        }
        int placeHolder = 0;
        while (true){
            int swapCount = 0;
            //swap internally by comparing current value and its next
            for (int i=1; i<length; i++){
                if (nums1[i-1]>nums1[i]){
                    placeHolder =nums1[i-1];
                    nums1[i-1]=nums1[i];
                    nums1[i]= placeHolder;
                    swapCount++;
                }
            }
            if (swapCount==0){
                break;
            }
        }
    }
}