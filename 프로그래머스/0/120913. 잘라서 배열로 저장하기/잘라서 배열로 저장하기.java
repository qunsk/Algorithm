class Solution {
    public String[] solution(String my_str, int n) {
        char[] arr = my_str.toCharArray();
        int leng = (my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[leng];
        
        for(int i=0;i<leng;i++){
            answer[i] = "";
            for(int j=n*i;j<n*(i+1);j++){
                if (j >= arr.length) break;
                answer[i] += arr[j];
            }
        }
        return answer;
    }
}