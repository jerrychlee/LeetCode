public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rever = 0;
        int m = n;
        for(int i=0; i<32; i++){
            int mod = m&1;
            rever = rever<<1;
            rever = rever+mod;
            m>>>=1;
        }
        return rever;
    }
}

