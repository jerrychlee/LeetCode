class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums==null || nums.length==0)
            return -1;
        int total=0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }
        
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(i!=0)
                sum+=nums[i-1];
            if((total-sum-nums[i])==sum)
                return i;
        }
        return -1;
    }
}