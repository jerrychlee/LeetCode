class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        int odd = 0;
        for(int num:nums){
            int numT = num;
            while(numT!=0){
                numT=numT/10;
                odd=odd^1;
                //System.out.printf("%d,%d\n", numT,odd);
            }
            count = (odd==1)? count:count+1;
            odd = 0;
        }
        //System.out.printf("count = %d\n", count);
        return count;
    }
}