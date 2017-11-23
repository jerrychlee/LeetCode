class Solution {
    public int countPrimes(int n) {
        int []Array= new int[n];
        int count = 0;
        for(int i=2; i<n;i++){
            if(Array[i]==0){
                count++;
                int j=2;
                while(i*j<n){
                    Array[i*j]=1;
                    j++;
                }
            }
        }
        return count;
    }
}
