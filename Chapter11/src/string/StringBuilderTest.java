package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer)); 
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer)); // append 후에도 buffer의 주소는 동일
		
		String str2 = buffer.toString();
		System.out.println(str2);
		
		
//		Integer i = new Integer(100); // deprecate 될 예정 그래서 아래처럼 써야함
		Integer i = 100;
	}

}
