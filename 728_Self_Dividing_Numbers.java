class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> out = new ArrayList<Integer>();
        
        for(int n=left; n<=right; n++){
            boolean isFound = true;
            int i=n;
            while(i!=0){
                int mod=i%10;
                if(mod == 0){
                    isFound = false;
                    break;
                }
                
                if(n%mod!=0){
                    isFound = false;
                    break;
                }
                i = i/10;
            }
            
            if(isFound==true)
                out.add(n);
            
            isFound = true;
        }
        
        //System.out.print(out);
        return out;
    }
}
