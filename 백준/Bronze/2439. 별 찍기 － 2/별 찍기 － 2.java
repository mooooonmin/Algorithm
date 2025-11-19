import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        sc.close();
        
        // 1. N번 반복하면서 각 줄을 처리하는 외부 반복문 (i는 현재 줄 번호)
        for (int i = 1; i <= N; i++) {
            
            // 2. 공백을 출력하는 내부 반복문
            // 총 공백 개수: N - i
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // 3. 별을 출력하는 내부 반복문
            // 총 별 개수: i
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // 4. 한 줄의 출력이 끝났으므로 줄바꿈
            System.out.println();
        }
    }
}