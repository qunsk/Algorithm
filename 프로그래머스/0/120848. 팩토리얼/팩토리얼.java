class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < 11; i++) {
            if (factorial(i) > n) {
                answer = i - 1;
                break;
            }else if(factorial(i) == n){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public int factorial(int i) {
        if (i == 1 || i == 0) {
            return 1;
        }
        return i * factorial(i - 1); // 재귀 호출로 팩토리얼 계산
    }
}