import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        //search through nums, return the index of the target
        //if target does not exist within nums, return -1
        //nums is sorted in ascending order : we can use the value to compare to target.
        //binary search works by checking if the indexed value is higher or lower than target,
        //then eliminating/ignoring the other half.
        
        //do non recursion first
        //find current size of the array
        int start = 0;
        int end = nums.length -1;
        //find the middle position
        int currentGuess = nums.length/2;
        //compare the value with target
        //end condition - find the loop or start and end is the same
        while(nums[currentGuess]!=target && (start!=end)){
            if (nums[currentGuess]>target){
                //calculate the next guess
                end = currentGuess-1;
            }
            else{
                start = currentGuess + 1;
            }
            currentGuess = start + (end - start)/2;
        }
            if (target==nums[currentGuess]){
            //base case
            return currentGuess;
        }
            return -1;
    }
}