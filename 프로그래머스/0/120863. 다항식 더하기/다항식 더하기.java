class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int constant = 0;   //상수
        int variable = 0;   //계수
        
        String[] arr = polynomial.split("\\+");
        
        for(int i=0;i<arr.length;i++){
            String str = arr[i].trim();
            
            if(str.endsWith("x")){
                if (str.equals("x")) {
                    variable += 1;
                } else {
                    variable += Integer.parseInt(str.substring(0, str.length() - 1));
                }
            }else{
                constant += Integer.parseInt(str);
            }
        }
        
        if(constant == 0){
            if(variable == 1){
                answer = "x";
            }else{
                answer = String.valueOf(variable)+"x";
            }
        }else if(variable == 0){
            answer = String.valueOf(constant);
        }else{
            if(variable == 1){
                answer = "x"+" + "+String.valueOf(constant);
            }else{
                answer = String.valueOf(variable)+"x"+" + "+String.valueOf(constant);
            }
        }
        
        return answer;
    }
}