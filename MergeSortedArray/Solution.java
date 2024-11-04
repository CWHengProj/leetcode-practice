class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //trying insertion sort
        //run through nums1, compare each int with nums2. if nums2 smaller, swap.
        //ignore 0. if there is no swaps happening, append all to the list.
        int placeHolder =0;
        while (true){
            int swapCount =0;
            for (int i=0; i<nums1.length;i++){
                for(int j=0; j<nums2.length; j++){
                    if (nums1[i]>nums2[j]){
                        placeHolder=nums1[i];
                        nums1[i]=nums2[j];
                        nums2[j]=placeHolder;
                        swapCount++;
                    }
                }
            }
            if (swapCount==0){
                nums1[3] = nums2[0];
                nums1[4] = nums2[1];
                nums1[5] = nums2[2];
                break;
            }
        }
    }
}