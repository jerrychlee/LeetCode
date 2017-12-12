class Solution {
    static int count;
    public int findTargetSumWays(int[] nums, int S) {
        
        count = 0;
        countSum(nums, S, 0, 0);
        
        return count;
    }
    
    public void countSum(int [] nums, int S, int sum, int i){
        
        if(i == nums.length){
            if(sum == S){
                count++;
            }    
        }else{
            countSum(nums, S, sum-nums[i], i+1);
            countSum(nums, S, sum+nums[i], i+1);
        }       
    }
}