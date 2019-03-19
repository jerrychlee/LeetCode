class Solution {
    public List<String> generateParenthesis(int n) {
    
        List<String> list = new ArrayList<String>();

        backTrace(list, "", 0, 0, n);
        
        return list;
    }
    
    void backTrace(List<String> list, String str, int open, int close , int num){
        
        if(str.length() == 2*num){
            list.add(str);
        }
        
        if(open<num) {
            backTrace(list, str + "(", open + 1, close , num);
        }
        
        if(close<open){
            backTrace(list, str + ")", open, close + 1, num);
        }
    }
}
