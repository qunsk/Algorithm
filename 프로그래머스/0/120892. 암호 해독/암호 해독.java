class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr = cipher.split("");
        for(int i=0;i<arr.length;i++){
            if(i%code == code-1){
                answer += arr[i];
            }
        }
        return answer;
    }
}