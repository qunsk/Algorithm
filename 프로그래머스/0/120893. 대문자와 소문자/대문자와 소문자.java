class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                answer += Character.toLowerCase(arr[i]);
            }else{
                answer += Character.toUpperCase(arr[i]);
            }
        }
        return answer;
    }
}