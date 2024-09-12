class Solution {
    public double solution(int n, int t) {
        double answer = n;
        for(int i=0;i<t;i++){
            answer *= 2;
        }
        return answer;
    }
}