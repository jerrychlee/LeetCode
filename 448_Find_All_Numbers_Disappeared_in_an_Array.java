class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int num:nums){
            int val = Math.abs(num)-1;
            if(nums[val]>0)
                nums[val]=-nums[val]; //This is a key
        }
        
        List<Integer>out = new ArrayList();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0)
                out.add(i+1);
        }
        return out;
    }
}
