class Solution {
    public int[] solution(int start_num, int end_num) {
        int b = start_num - end_num +1;
        int[] answer = new int[b];
        for(int a=0;a<answer.length;a++){
            answer[a]=start_num - a;
        }
        return answer;
    }
}