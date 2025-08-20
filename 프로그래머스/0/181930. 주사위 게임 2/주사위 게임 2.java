class Solution {
    
    public int solution(int a, int b, int c) {
        
        if( a == b && b == c && c == a)
            return (int)((Math.pow(a,1) * 3) * (Math.pow(a,2) * 3) * (Math.pow(a,3) * 3));
        else if(a==b||a==c||b==c)
            return (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        else 
            return (a + b + c);
    }
}