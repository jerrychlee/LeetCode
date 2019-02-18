========================================================================================

Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square 
brackets is being repeated exactly k times. Note that k is guaranteed to be a positive 
integer.

You may assume that the input string is always valid; No extra white spaces, square 
brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that 
digits are only for those repeat numbers, k. For example, there won't be input like 
3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

========================================================================================

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
