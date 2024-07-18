import java.lang.StringBuilder;

class Solution {
    public String solution(String rsp) {
        char[] charArray = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<charArray.length;i++){
            
            if(charArray[i]=='0'){
                sb.append('5');
            }else if(charArray[i]=='2'){
                sb.append('0');
            }else if(charArray[i]=='5'){
                sb.append('2');
            }
        }
        return sb.toString();
    }
}