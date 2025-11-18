import java.util.*;

public class Main{
	
	public static void main(String args[]){
		// 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();

        if (a >= 90) {
            System.out.println("A");

        } else if(a >= 80) {
            System.out.println("B");

        } else if(a >= 70) {
            System.out.println("C");

        } else if(a >= 60) {
            System.out.println("D");
            
        } else {
            System.out.println("F");
        }

        sc.close(); 
	}
	
}