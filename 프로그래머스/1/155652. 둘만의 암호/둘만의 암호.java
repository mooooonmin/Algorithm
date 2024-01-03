class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char[] sArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();
        
        for(int i = 0; i < sArr.length; i++){
            for(int l = 0; l < index; l++) {
                if(sArr[i] + 1 == 123) {
                    sArr[i] = (char) 97;    
                } else {
                    sArr[i] = (char) (sArr[i] + 1) ;    
                }                
                for(int k = 0; k < skipArr.length; k++){
                    if((int) sArr[i] == (int) (skipArr[k])){
                        --l;
                        break;
                    }
                }
               
            }
            
            
        }
        answer = String.valueOf(sArr);
        return answer;
    }
}