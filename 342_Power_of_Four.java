class Solution {
    public boolean isPowerOfFour(int num) {
        double a = Math.log(num)/Math.log(4);
        return (a%1==0)?true:false;
    }
}
