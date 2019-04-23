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


class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        
        if(nums.length==0)
            return -1;
        
        if(nums.length==1)
            return 0;
        
        for(int num:nums ){
            right+=num;
        }
        
        for(int i=0; i<nums.length; i++){
            if(i!=0){
                left+=nums[i-1];            
            }
            right-=nums[i];
            
            if(left == right)
                return i;
        }
        
        return -1;
    }
}