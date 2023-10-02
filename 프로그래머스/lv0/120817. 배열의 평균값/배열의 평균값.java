import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        double ave = Arrays.stream(numbers).average().orElse(0);
        
        answer = ave;
            
        return answer;
    }
}