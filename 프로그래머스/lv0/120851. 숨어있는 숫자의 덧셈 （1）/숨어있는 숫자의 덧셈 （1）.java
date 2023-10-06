class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-z]", "");
        String[] str = my_string.split("");
        
        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}