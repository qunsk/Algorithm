class Solution {
    public int[] solution(int n) {
        int arrlength = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0) arrlength++;
        }
        
        int[] answer = new int[arrlength];
        int cnt = 1;
        for(int i=0;i<answer.length;i++){
            if(n%cnt == 0){
                answer[i] = cnt;
                cnt++;
            }else if(n%cnt != 0){
                i--;
                cnt++;
            }
        }
        return answer;
    }
}