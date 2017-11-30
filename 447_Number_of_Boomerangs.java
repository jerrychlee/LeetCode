class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        for(int i=0; i<points.length; i++){
            for(int j=0; j<points.length; j++){
                if(i==j){
                    continue;
                }
                int d = distance(points[i],points[j]);
                if(map.containsKey(d)){
                    int val = map.get(d);
                    count+=val*2;
                    map.put(d, val+1);
                }else{
                    map.put(d, 1);
                }
            }
            map.clear();
        }
        return count;
    }
    
    public int distance(int[] a, int[] b){
        int x = a[0]-b[0];
        int y = a[1]-b[1];
        
        return x*x+y*y;
    }
}

