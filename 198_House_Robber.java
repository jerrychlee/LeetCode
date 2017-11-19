/*                                                                 */
/* Reference from http://www.qiujiawei.com/leetcode-problem-198/   */
/*                                                                 */

class Solution {
    public int rob(int[] nums) {
        if(nums==null)
            return 0;
        if(nums.length==1)
            return nums[0];
        
        int pre = 0;
        int cur = 0;
        for(int i=0; i<nums.length; i++){
            int tmp = cur;
            cur = Math.max(pre+nums[i], cur);
            pre = tmp;
            //System.out.println(cur+" ");
        }
        return cur;
    }
}
