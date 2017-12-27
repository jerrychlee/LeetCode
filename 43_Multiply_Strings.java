class Solution {
    public String multiply(String num1, String num2) {
        
        int idx1 = num1.length()-1;
        int idx2 = num2.length()-1;
        int carry = 0;
        String out = "0";
        
        char []cn1 = num1.toCharArray();
        char []cn2 = num2.toCharArray();
        
        if((idx1==0 && cn1[idx1]=='0')||(idx2==0 && cn2[idx2]=='0')){
            return "0";
        }
            
        while(idx2>=0){
            StringBuilder sb = new StringBuilder();
            int count = num2.length()-1-idx2; 
            while(count>0){
                sb.insert(0,0);
                count--;
            }
            int n2 = cn2[idx2]-'0';
            idx1 = num1.length()-1;
            while(idx1>=0 || carry!=0){
                int n1 = 0;
                if(idx1>=0){
                    n1 = cn1[idx1]-'0';
                }
                int multiply = (n1*n2) + carry;
                sb.insert(0,(multiply)%10);
                carry = (multiply)/10;
                idx1--;
            }

            //debug
            //System.out.println(sb.toString());
            
            idx2--;
            out = addStrings(out, sb.toString());       
        }
        return out;
    }

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