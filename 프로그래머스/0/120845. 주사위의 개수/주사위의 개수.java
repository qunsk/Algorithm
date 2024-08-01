class Solution {
    public int solution(int[] box, int n) {
        int width = box[0]/n;
        int len = box[1]/n;
        int height = box[2]/n;
        
        return width*len*height;
    }
}