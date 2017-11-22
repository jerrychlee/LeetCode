class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        uint32_t rever = 0;
        uint32_t m = n;
        for(int i=0; i<32; i++){
            int mod = m%2;
            rever = rever<<1;
            rever = rever+mod;
            m/=2;
        }
        return rever;
    }
};