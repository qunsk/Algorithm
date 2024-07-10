import java.lang.StringBuilder;

class Solution {
    public String solution(int age) {
        String alphabet = "abcdefghij";
        char[] abc = alphabet.toCharArray();
        
        StringBuilder answer = new StringBuilder();
        
        // 각 자릿수를 문자열로 변환하고 해당 문자를 찾는 과정
        while (age > 0) {
            int numbers = age % 10;
            answer.insert(0, abc[numbers]);  // 앞에 추가하여 자릿수가 뒤집히지 않도록 함
            age /= 10;
        }
        
        return answer.toString();
    }
}