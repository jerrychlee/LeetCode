/* The isBadVersion API is defined in the parent class VersionControl.
 boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low<high){
            int medium = low + (high-low)/2; /* key! */
            
            if(isBadVersion(medium)){
                high = medium;
            }else{
                low = medium+1;
            }
        }
        
        return low;
    }
}
