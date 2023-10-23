class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() != 4 && s.length() != 6) 
            return false;
        
        else {
            for(int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            if('0' > ch || ch > '9')
                return false;  
            }
        }

        return true;
    }
}