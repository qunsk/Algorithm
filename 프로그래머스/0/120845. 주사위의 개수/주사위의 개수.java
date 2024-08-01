class Solution {
    public int solution(int[] box, int n) {
        int width = 0;
        int len = 0;
        int height = 0;
        
        width = box[0]/n;
        len = box[1]/n;
        height = box[2]/n;
        
        return width*len*height;
    }
}