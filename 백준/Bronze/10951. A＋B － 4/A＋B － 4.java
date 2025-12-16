import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException // BufferedReader는 예외처리 필수.
        
    {
        String line;
        while((line = br.readLine()) != null) // 입력이 null이 아닐 때 까지.
        {
            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            
            bw.write(String.valueOf(sum) + '\n'); // 합을 String으로 형변환 한 형태에 \n으로 예제 출력과 같이 만들어 줍니다.
            bw.flush(); // 반복문 안에 flush를 넣어 매 반복마다 출력합니다.
        }
        bw.close();
    }
    
}