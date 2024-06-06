class Solution {
    public int[] solution(int n) {
        if(n%2==0){
            int[] answer = new int[n/2];
            for(int a=0;a<n/2;a++){
                answer[a]=2*a+1;
            }
            return answer;
        }else{
            int[] answer = new int[n/2+1];
            for(int a=0;a<n/2+1;a++){
                answer[a]=2*a+1;
            }
            return answer;
        }
    }
}