class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                int j=i+1;
                while(j<nums.length){
                    if(nums[j]!=0){
                        nums[i]=nums[j];
                        nums[j]=0;
                        break;
                    }else{
                        j++;
                    }
                }                
            }else{
                //do nothing
            }
        }    
    }
}