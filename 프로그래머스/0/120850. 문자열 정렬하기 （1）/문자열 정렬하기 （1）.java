import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        char[] my_char = my_string.toCharArray();
        int[] changeInt = new int[my_char.length];
        int num = 0;
        
        for(int i=0;i<my_char.length;i++){
            changeInt[i] = my_char[i] - '0';
            if(changeInt[i]>=0 && changeInt[i]<=9){
                num++;
            }
        }
        Arrays.sort(changeInt);
        
        int[] answer = Arrays.copyOf(changeInt, num);
        
        return answer;
    }
}