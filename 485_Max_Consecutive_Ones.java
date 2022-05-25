class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num==1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}

class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0; int max=0;
        for(int num:nums){
            if(num==0)
                count=0;
            else{
                count++;
                max=Math.max(count,max);
            }
        }
        return max;
    }
}

class Solution3 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            count = (num==0) ? 0:count+1; 
            max = Math.max(count, max);
        }
        return max;
    }
}