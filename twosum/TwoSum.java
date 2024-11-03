import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int k=0;  k<nums.length; k++){
            int toFind = target - nums[k];
            if (newMap.containsKey(toFind)){
                int [] soln = {k,newMap.get(toFind)};
                return soln;
            }
            newMap.put(nums[k],k);
        }
        return null;
    }
}