class Solution {
    public int arrangeCoins(int n) {
        int num = n;
        int i=0;
        while(num>=0){
            num -= ++i;
        }
        return (i-1)>0?i-1:0;
    }
}
