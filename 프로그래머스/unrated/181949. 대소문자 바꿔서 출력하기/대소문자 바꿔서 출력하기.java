import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                System.out.print((char)('a' + ch - 'A'));
	      } else 
                System.out.print((char)('A' + ch - 'a'));
        }
    }
}