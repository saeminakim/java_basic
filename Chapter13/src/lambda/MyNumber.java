package lambda;

//어노테이션 달아주면 두 번째 메소드를 선언하는 순간 에러 발생
@FunctionalInterface 
public interface MyNumber {

	int getMaxNumber(int num1, int num2); // 인터페이스를 이용해서 람다식에서 사용할 메소드 선언
	
	
	// int testNumber();
	// 람다를 사용하기 위해 만든 인터페이스는 메소드가 딱 하나만 선언되어 있어야 함
	// 그렇지 않으면 실제 구현부에서 어떤 메소드를 말하는건지 알 수가 없어 에러 발생
}
