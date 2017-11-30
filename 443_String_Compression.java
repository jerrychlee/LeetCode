class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int count = 1;
        char c = chars[0];
        for(int i=0; i<chars.length; i++){
            if(i==chars.length-1 || chars[i]!=chars[i+1]){
                chars[index] = c;
                if(count>1){
                    int j=1;
                    String s = Integer.toString(count);
                    for(int m=0; m<s.length(); m++){
                        chars[index+j] = s.charAt(m);
                        j++;
                    }
                    index = index+j;
                    if(i!=chars.length-1)
                        c = chars[i+1];
                    count = 1;
                }else{
                    index++;
                    if(i!=chars.length-1)
                        c = chars[i+1];
                    count = 1;
                }
            }else{
                count++;
            }
        }
        return index;
    }
}
