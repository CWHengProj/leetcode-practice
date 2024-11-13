class Solution {
    public int maxProfit(int[] prices) {
        //given an array of integers, return the highest profit possible
        int maxProfit = -199999;
        //want to loop through the array, and exclude the rest of the integers
        for (int i =0 ; i<prices.length ; i++){
            int j = i+1;
            while (j<prices.length){
                if ((prices[j]- prices[i])>maxProfit){
                    maxProfit = prices[j]- prices[i];
                }
                j++;
            }
        }
        return maxProfit>=0 ? maxProfit: 0;
    }
}