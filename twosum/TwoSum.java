class Solution {
    public int[] twoSum(int[] nums, int target) {
        //go through each of the numbers in the array, and do the math to find the desired pair. find the rest of the digits if there is a match.
        for (int i=0;i<nums.length; i++){
            int lf = target - nums[i];
            for (int j=i+1; j<nums.length; j++){
                if (nums[j]==lf){
                    int[] solution = {i,j};
                    return solution;
                }
            }
        }
    return null;
    }
}