class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        //공백을 기준으로 나눔
        String[] arr = letter.split(" ");
        
        for(String s:arr){
            for(int i=0;i<morse.length;i++){
                if(morse[i].equals(s)){
                    answer += (char)(i+'a');
                }
            }
        }
        return answer;
    }
}