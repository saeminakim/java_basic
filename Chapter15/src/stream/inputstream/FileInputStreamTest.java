package stream.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {

		FileReader fis = null;
		int i = 0;
		
		try {
			fis = new FileReader("input.txt"); // 문자는 FileReader로 읽는게 나음
			
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
				
			}


		} catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
