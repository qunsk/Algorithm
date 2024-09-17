class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i=0;i<array.length;i++){
            str += String.valueOf(array[i]);
        }
        
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='7')  answer++;
        }
        return answer;
    }
}