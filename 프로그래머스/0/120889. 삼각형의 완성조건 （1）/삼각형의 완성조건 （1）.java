class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int sum = 0;
        
        for(int i=0;i<sides.length;i++){
            if(max<sides[i]){
                max = sides[i];
            }else{
                sum += sides[i];
            }
        }
        if(max<sum){
            return 1;
        }else{
            return 2;
        }
    }
}