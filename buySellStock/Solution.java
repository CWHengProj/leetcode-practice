class Solution {
    public int maxProfit(int[] prices) {
        //given an array of integers, return the highest profit possible
        int maxProfit = 0;
        int buyLow = prices[0]; //start from the first int, if there is a lower value means there is potential to make more profit
        //want to loop through the array, and exclude the rest of the integers
        for (int i =0 ; i<prices.length ; i++){
            if (prices[i]<buyLow){
                buyLow = prices[i]; //ignores if there is no new lowest
            }
            else if (prices[i]-buyLow > maxProfit){
                maxProfit = prices[i] - buyLow; //iterate through and find the best profit if there is higher val
            }
        }
        return maxProfit;
    }
}