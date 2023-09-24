class Solution {
    public int solution(int a, int b) {
        
        String ab = Integer.toString(a) + Integer.toString(b);
        int abVal = Integer.valueOf(ab);
        
        return (abVal >= 2*a*b) ? abVal : 2*a*b;
    }
}