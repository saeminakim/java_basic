package exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		try(AutoCloseObj obj = new AutoCloseObj()) {
			
			// AutoCloseObj에서 정의한 run() 호출됨
			
			throw new Exception(); // 예외 발생시키는 방법
			
		} catch (Exception e) {
			System.out.println("exception");
		}
	}

}
