class Solution {
    public int[] sortedSquares(int[] nums) {
    
        int []numsT = new int[nums.length];
        int i=0;
        for(int num:nums){
            numsT[i]=num*num;
            i++;
        }
        Arrays.sort(numsT);
        return numsT;
    }
}