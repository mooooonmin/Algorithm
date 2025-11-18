import java.util.*;

public class Main{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
        // 1. sc.next() 대신 sc.nextLine()을 사용하여 입력 줄 전체 읽기
        // next() -> 공백기준으로 한단어만 읽음
		String inputLine = sc.nextLine();
        
        // 2. 입력 문자열을 공백 기준으로 쪼개어 단어 배열 만들기
        //    trim()을 사용하여 앞뒤 공백을 제거해야 공백만 있는 경우 빈 문자열로 쪼개지지 X
        //    +를 사용하여 공백이 여러 개여도 하나의 구분자로 처리
        String[] words = inputLine.trim().split("\\s+");
        
        // 3. cnt 변수를 main 메서드 범위 내에서 선언하고 0으로 초기화
        int cnt = 0; 
        
        // 4. 단어가 전혀 없는 경우 (빈 문자열 입력 시)를 처리
        //    trim().split("\\s+")의 결과 배열은 빈 문자열 입력 시에도 길이가 1인 경우가 있을 수 있음
        //    따라서 단어 배열의 길이가 1이고 그 내용이 비어있는지 확인해야 함
        
        if (words.length == 1 && words[0].isEmpty()) {
            cnt = 0; // 단어가 없으면 0
        } else {
            cnt = words.length; // 단어가 있으면 배열의 길이(단어의 개수)
        }
        
        // 5. 단어 개수를 출력 (for 루프를 사용할 필요X. 배열의 길이 = 단어 개수)
		System.out.println(cnt);
        
        sc.close();
	}
	
}