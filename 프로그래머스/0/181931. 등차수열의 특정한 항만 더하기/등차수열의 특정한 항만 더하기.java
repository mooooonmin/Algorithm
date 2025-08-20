class Solution {
    
    public static int solution(int a, int d, boolean[] included) {
        
        int sum = 0;

        for (int i = 0; i < included.length; i++) {
            // i번째 항은 a + (i * d)로 계산
            int term = a + (i * d);

            // included[i]가 true인 경우에만 sum에 더하기
            if (included[i] == true) {
                sum += term;
            }
        }

        return sum;
    }
}