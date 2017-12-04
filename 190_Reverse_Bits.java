public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        int m = n;
        for(int i=0; i<32; i++){
            int mod = m&1;
            reverse = reverse<<1;
            reverse = reverse+mod;
            m>>>=1;
        }
        //debug
        //System.out.println(Integer.toBinaryString(reverse));
        return reverse;
    }
}

