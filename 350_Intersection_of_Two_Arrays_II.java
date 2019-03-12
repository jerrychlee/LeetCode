class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> aList = new ArrayList<Integer>(); 

        for(int num:nums1){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);            
            }else{
                map.put(num,1);                            
            }
        }

        for(int num:nums2){
            if(map.containsKey(num)){
                int c = map.get(num);
                if(c==1){
                    map.remove(num);   
                }else{
                    map.replace(num,c-1);   
                }
                aList.add(num);
            }
        }

      
        int[] out = new int[aList.size()];
        
        for(int i=0; i<aList.size(); i++){
            out[i] = aList.get(i);
        }
        
        return out;
    }
}