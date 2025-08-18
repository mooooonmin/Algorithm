import java.util.Arrays;

class Solution {
    
    public int[] solution(int[] num_list) {
        
        int arrLength = num_list.length;
        int aheadNum = num_list[arrLength - 2];
        int behindNum = num_list[arrLength - 1];
        
        int[] resultArray = Arrays.copyOf(num_list, arrLength + 1);

        resultArray[resultArray.length-1] = behindNum > aheadNum ? behindNum - aheadNum : behindNum * 2;

        return resultArray;
    }
}