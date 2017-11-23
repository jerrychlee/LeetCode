class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new TreeSet();
        
        int r = n;
        while(true){
            if(set.add(r)!=true){
                return false;
            }
            
            int sum = 0;
            while(r>0){
                int m=r%10;
                sum+= m*m;
                r/=10;
                //debug
                //System.out.println(sum);
            }
            
            if(sum==1){
                return true;
            }
            
            r = sum;
        }
    }
}
