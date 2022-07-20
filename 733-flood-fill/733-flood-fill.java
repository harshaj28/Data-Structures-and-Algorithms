class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color ) return image;
        clring( image, sr, sc, color, image[sr][sc]);
        return image;
    }
    private void clring( int[][] image , int R, int C,int color, int pre){
        if(image[R][C] == pre){
            image[R][C] = color;
            if(R-1 >= 0) clring(image , R-1 , C , color ,pre);
            if(C-1 >= 0) clring(image , R , C-1 , color ,pre);
            if(R+1 < image.length) clring(image , R+1 , C , color ,pre);
            if(C+1 < image[0].length) clring(image , R , C+1 , color ,pre);
        }
        else return ;
    }
}