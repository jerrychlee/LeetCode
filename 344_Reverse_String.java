/******************************/
/* Version 1                  */
/******************************/
class Solution {
    public String reverseString(String s) {
        char []c = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        char tmp = '\0';
        while(i<=j){
            tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return new String(c);
    }
}

/******************************/
/* Version 2                  */
/******************************/
class Solution {
    public String reverseString(String s) {
        StringBuilder out = new StringBuilder(s);
        return out.reverse().toString();
    }
}
