package exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		try(AutoCloseObj obj = new AutoCloseObj()) {
			
			// AutoCloseObj���� ������ run() ȣ���
			
			throw new Exception(); // ���� �߻���Ű�� ���
			
		} catch (Exception e) {
			System.out.println("exception");
		}
	}

}
