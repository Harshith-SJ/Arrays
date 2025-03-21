class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxpro=0;
        for(int i=1;i<prices.length;i++){
            if(minprice>prices[i]){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                if(maxpro<profit){
                    maxpro=profit;
                }
            }
        }
        return maxpro;
    }
}