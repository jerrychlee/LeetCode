class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;

        if(num<=0){
            return false;            
        }
        
        while(num>0){
            num-=i;
            i+=2;
        }
        
        return (num==0)? true:false;
    }
}