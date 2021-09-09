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
}
