package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {

		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			// 어떤 예외가 발생할지 모르는 경우에는 최상위 클래스 Exception을 넣어주기도 함
			// 다른 catch와 함께 쓰려면 최상위 클래스를 맨 아래 넣어줘야 함
			System.out.println(e);
		}
		System.out.println("end");
	}

}
