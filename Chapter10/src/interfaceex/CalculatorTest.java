package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		
//		Calc calc1 = new Calc(); // ���� �߻�
//		Calc calc2 = new Calculator(); // ���� �߻�		
		
		
		System.out.println(calc.add(num1, num2));
		
		calc.desciption();
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
