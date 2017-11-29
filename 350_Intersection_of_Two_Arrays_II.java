class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> out = new ArrayList();
        for(int num:nums1){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        
        for(int num:nums2){
            int val = map.getOrDefault(num, 0);
            if(val!=0){
                out.add(num);
                if(val==1){
                    map.remove(num);
                }else{
                    map.put(num, val-1);
                }
            }
        }
        
        int[] n = new int[out.size()];
        for(int i=0; i<out.size(); i++){
            n[i] = out.get(i);
        }
        
        return n;
    }
}
