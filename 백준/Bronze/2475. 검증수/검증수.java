import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // 검증수 계산을 위한 합계 변수 초기화
        int sumOfSquares = 0;
        
        // 고유번호의 처음 5자리를 반복하여 입력받고 제곱 합계를 계산
        for (int i = 0; i < 5; i++) {
            // 빈칸을 사이에 둔 5개의 숫자를 하나씩 입력받음
            int digit = sc.nextInt(); 
            
            // 1. 숫자를 제곱한 후
            int squaredDigit = digit * digit; 
            
            // 2. 합계에 더함
            sumOfSquares += squaredDigit; 
        }
        
        // 3. 최종 합계를 10으로 나눈 나머지를 구함 (검증수)
        int verificationNumber = sumOfSquares % 10;
        
        // 4. 검증수 출력
        System.out.println(verificationNumber);
        
        sc.close();
    }
}