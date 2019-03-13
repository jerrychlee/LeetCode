
219. Contains Duplicate II

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet();    
        for(int i=0; i<nums.length; i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            
            if(set.contains(nums[i])){
                return true;
            }
            
            set.add(nums[i]);
        }
        
        return false;
    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int out = Integer.MAX_VALUE;
        int i = 0;
        for(int num:nums){
            if(map.containsKey(num)){
                int distinct = i - map.get(num);
                if(distinct < out){
                    out = distinct;
                }
                map.replace(num,i);
            }else{
                map.put(num,i);
            }
            i++;
        }
        return out <= k ? true:false; 
    }
}