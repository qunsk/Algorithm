class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a = 0;
        if(n>0 && n<1000 && n/10 <= k && k < 1000){
            a = n/10 ;
            k = k - a ;
            answer = n*12000 + k*2000;
        }
        return answer;
    }
}