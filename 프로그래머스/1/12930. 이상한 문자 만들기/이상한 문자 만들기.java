class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        String[] str = s.split("");
        
        for(String aStr : str) {
            count = aStr.contains(" ") ? 0 : count + 1;
            answer += (count%2 == 0) ? aStr.toLowerCase() : aStr.toUpperCase();
        }
        return answer;
    }
}