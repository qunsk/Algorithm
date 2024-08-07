import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numString = my_string.replaceAll("[A-Za-z]","");
        char[] numChar = my_string.toCharArray();
        int[] numbers = new int[numChar.length];
        
        for(int i=0;i<numChar.length;i++){
            numbers[i] = numChar[i] - '0';
            if(numbers[i]>0 && numbers[i]<10)
                answer += numbers[i];
        }
        
        return answer;
    }
}