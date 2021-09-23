package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		} finally {
			System.out.println("finally"); // finally :  try가 수행되면 무조건 수행됨
		}
		System.out.println("end"); // 위에 return이 있기 때문에 이 문장은 수행 안됨
	}

}
