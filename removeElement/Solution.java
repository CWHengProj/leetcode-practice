
class Solution {
    public static int removeElement(int[] nums, int val) {
        int k=0;
        //run through all the values in nums, and remove any val that matches. increase the count of k. return k in the end.
        int[] numArr = new int[nums.length];
        int l =0;//position of the value in numArr the temp one
        for (int i=0;i<nums.length;i++){
            if (nums[i]==val){
                k++;
            }
            else{
                numArr[l]=nums[i];
                l++;
            }
        }
        nums=numArr;
        return k;
    }
}