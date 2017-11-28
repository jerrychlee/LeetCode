class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        checkColor(image, sr, sc, image[sr][sc], newColor);
        
        return image;
        
    }
    
    public void checkColor(int[][] image, int sr, int sc, int currentColor, int newColor){
        int x = image.length;
        int y = image[0].length;
        
        if(image[sr][sc]==currentColor && image[sr][sc]!=newColor){
            
            System.out.println(sr+" "+sc);
            image[sr][sc] = newColor;
            
            if(sr>0){
                checkColor(image, sr-1, sc, currentColor, newColor);
            }
            
            if(sc>0){
                checkColor(image, sr, sc-1, currentColor, newColor);
            }
            
            if(sr<x-1){
                checkColor(image, sr+1, sc, currentColor, newColor);
            }
            
            if(sc<y-1){
                checkColor(image, sr, sc+1, currentColor, newColor);
            }
        }
    }
}
