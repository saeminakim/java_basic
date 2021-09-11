package interfaceex;

public interface Calc {
	// interface는 상수와 추상메소드로 선언됨
	
	// 키워드 따로 쓰지 않아도 public static final로 선언
	double PI = 3.14;
	int ERROR = -999999999;
	
	// interface는 자동으로 public abstract로 컴파일됨

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// interface에서 구현한 디폴트 메소드
	// default 키워드를 반드시 써줘야 함
	default void desciption() { 
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	
	// 정적 메소드 구현
	// 다른 클래스에서 Calc.total()로 호출
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
