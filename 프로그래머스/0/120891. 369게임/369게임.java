class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] num = Integer.toString(order).toCharArray();
        for(int i=0;i<num.length;i++){
            if(num[i]=='3' || num[i]=='6' || num[i]=='9')
                answer++;
        }
        return answer;
    }
}