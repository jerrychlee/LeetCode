class Solution {
    public int maxProfit(int[] prices) {
        
        int sum = 0;
        for(int i=0; i<prices.length-1; i++){
            int s = prices[i+1]-prices[i]; 
            if(s>0){
                sum+=s;
            }
        }
        return sum;
    }
}