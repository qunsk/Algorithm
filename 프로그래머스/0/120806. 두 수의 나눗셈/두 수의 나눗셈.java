class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean txt = (num1>0 && num1<=100 && num2>0 && num2<=100);
        double a = 0;
        
        if(txt){
            a = (num1*1.0)/num2*1000;
            answer = (int)a;
        }
        return answer;
    }
}