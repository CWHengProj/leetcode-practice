import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> newMap = new HashMap<>();
            for (int i=0; i<nums.length; i++){
                int pair = target - nums[i];
                if (newMap.containsKey(pair)){
                    int[] soln = {newMap.get(pair),i};
                    return soln;
                }
                newMap.put(nums[i],i);
            }
    
            return null;
        }
    }
}
