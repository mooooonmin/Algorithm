class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[0] += num_list[i]%2 == 0 ? 1 : 0;
            answer[1] += num_list[i]%2 == 0 ? 0 : 1;
        }
        
        return answer;
    }
}