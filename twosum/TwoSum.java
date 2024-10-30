class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length;i++){
            int searchingFor = target - nums[i];
            for (int j=1; j<nums.length;j++){
                if (i==j){
                    continue;
                }
                if (nums[j]==searchingFor){
                    int[] solution = {i,j};
                    return solution;
                }
            }
        }
    int[] nothing = new int[2];
    return nothing;
    }
}