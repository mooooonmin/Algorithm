class Solution {
    public int solution(int[] array) {
        
        int answer = array[0];
        int max = 0; 
        int freq[] = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            freq[array[i]]++;
            
            if(max < freq[array[i]]) {
                max = freq[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0;
        for(int j = 0; j < 1000; j++) {
            if(max == freq[j]) 
                temp++;
            if(temp > 1) 
                answer = -1;
        }
        return answer;
    }
}