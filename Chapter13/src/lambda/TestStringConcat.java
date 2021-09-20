package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍 방식으로 구현
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		// 람다식으로 구현
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "java");
		
		// 위 람다식을 풀어쓰면 이렇게 됨
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		
		concat2.makeString("hello", "java");
	}

}
