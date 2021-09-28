package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))) {
			// FileInputStream으로 읽으면 한글이 다 깨짐
			// 그래서 보조 스트림인 InputStreamReader를 한 번 더 사용
			// InputStreamReader는 직접 읽고 쓰는 기능이 없음 -> 매개변수로 다른 InputStream을 써야 함
			
			int i = 0;
			while((i = irs.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
