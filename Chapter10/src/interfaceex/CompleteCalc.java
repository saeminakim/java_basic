package interfaceex;

public class CompleteCalc extends Calculator {
	// 구현 상속(extends)

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	
	// interface에서 정의한 디폴트 메소드 재정의
	@Override
	public void desciption() {
		System.out.println("완벽한 계산기입니다.");
	}

	
}
