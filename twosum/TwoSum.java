class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            int toFind = target - nums[i];
            for (int j=0; j<nums.length;j++){
                if (i==j){
                    continue;
                }
                if (nums[j]==toFind){
                    int[] toReturn = {i,j};
                    return toReturn;
                }
            }
            
        }
        return null;
    }
}