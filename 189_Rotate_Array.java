class Solution {
    public void rotate(int[] nums, int k) {
 
        if(nums==null||nums.length==0)
            return;
        
        k = k%nums.length;

        System.out.print(k);
        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        
    }
    
    private void reverse(int[] nums, int s, int e){      
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}