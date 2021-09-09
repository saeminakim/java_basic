package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		
//		Calc calc1 = new Calc(); // 에러 발생
//		Calc calc2 = new Calculator(); // 에러 발생		
		
		
		System.out.println(calc.add(num1, num2));
		
		
	}

}
