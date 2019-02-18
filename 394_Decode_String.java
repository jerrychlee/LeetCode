class Solution {
    public String decodeString(String s) {
        Deque<Integer> num = new ArrayDeque();
        Deque<String> remain = new ArrayDeque();
        StringBuilder out = new StringBuilder();
            
        char [] chars = s.toCharArray();
        int i = 0;
        int n = 0;
        
        while(i< chars.length){
            if(Character.isDigit(chars[i])){
                n = n*10 + chars[i]-'0';
            }else if(Character.isLetter(chars[i])){
                out.append(chars[i]);
            }else{
                
                switch(chars[i]){
                    case '[':
                        num.offerLast(n);
                        n = 0;
                        remain.offerLast(out.toString());
                        out.delete( 0, out.length() );
                        break;
                    case ']':
                        StringBuilder temp = new StringBuilder();
                        int repeatTimes = num.pollLast();
                        temp.append(remain.pollLast());
                        for(int c=0 ; c<repeatTimes; c++){
                           temp.append(out.toString()); 
                        }
                        out = temp;
                        break;
                    default:
                        break;
                }

            }
            i++;        
        }
        
        return out.toString();
