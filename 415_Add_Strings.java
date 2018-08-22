class Solution {
    public String addStrings(String num1, String num2) {
        int idx1 = num1.length()-1;
        int idx2 = num2.length()-1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        char [] c1 = num1.toCharArray();
        char [] c2 = num2.toCharArray();
        while(idx1>=0 || idx2>=0 || carry!=0){
            int sum = 0;
            int n1 = 0;
            int n2 = 0;
            if(idx1>=0){
                n1 = (c1[idx1]-'0');
            }
            if(idx2>=0){
                n2 = (c2[idx2]-'0');
            }
            sum = n1 + n2 + carry;
            sb.insert(0, (char)((sum%10)+'0'));
            carry = sum/10;
            idx1--;
            idx2--;
        }
        return sb.toString();
    }
}