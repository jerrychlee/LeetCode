class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int count = 0;
        while(xor!=0){
            if(xor%2!=0)
                count++;
            xor/=2;
        }        
        return count;
    }
}
