import java.util.*;

public class Main{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();

        if (a % 4 == 0) {
            
            if (a % 100 != 0) {
                System.out.println(1); // 4의 배수이지만 100의 배수가 아님 (윤년)
                
            } else { // 4의 배수이면서 100의 배수인 경우
                if (a % 400 == 0) {
                    System.out.println(1); // 400의 배수임 (윤년)
                } else {
                    System.out.println(0); // 100의 배수이지만 400의 배수는 아님 (평년)
                }
            }
            
        } else {
            System.out.println(0); // 4의 배수가 아님 (평년)
        }
        
	}
	
}